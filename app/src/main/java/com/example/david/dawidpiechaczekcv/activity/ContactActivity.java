package com.example.david.dawidpiechaczekcv.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.david.dawidpiechaczekcv.R;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

/**
 * Created by Dawid on 06.02.2017.
 */

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_contact);
        setShowCaseInstruction();
    }

    private void setShowCaseInstruction() {
        ViewTarget target = new ViewTarget(R.id.ac_tv_linkedin, this);
        new ShowcaseView.Builder(this)
                .setTarget(target)
                .setStyle(R.style.CustomShowcaseTheme)
                .setContentTitle(getString(R.string.ca_showcase_title))
                .setContentText(getString(R.string.ca_showcase_text))
                .hideOnTouchOutside()
                .build();
    }

    public void onClick(View sharedView) {
        int id = sharedView.getId();
        switch (id) {
            case R.id.ac_tv_linkedin:
                openWebURL(getString(R.string.ca_linkedin_url));
                break;
            case R.id.ac_tv_facebook:
                openWebURL(getString(R.string.ca_facebook_url));
                break;
            case R.id.ac_tv_phone:
                callMobile(getString(R.string.ca_phone_number));
                break;
            default:
                sendMail();
                break;
        }
    }

    public void openWebURL(String inURL) {
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(inURL));
        startActivity(browse);
    }

    public void callMobile(String inURL) {
        Intent callPhone = new Intent(Intent.ACTION_CALL, Uri.parse(inURL));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callPhone);
    }

    public void sendMail() {
        Intent sendMessage = new Intent(Intent.ACTION_SEND);
        sendMessage.setType(getString(R.string.ca_mail_type));
        sendMessage.putExtra(Intent.EXTRA_TEXT, getString(R.string.ca_mail_text));

        startActivity(sendMessage);
    }
}
