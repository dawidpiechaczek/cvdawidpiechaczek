package com.example.david.dawidpiechaczekcv.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.david.dawidpiechaczekcv.R;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ActionViewTarget;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

import java.util.Locale;

import rx.Observable;
import rx.Subscriber;

import static android.R.attr.onClick;
import static android.R.attr.type;
import static android.app.ActivityOptions.makeSceneTransitionAnimation;

public class MainActivity extends Activity {

    private Context mContext = MainActivity.this;
    private String language_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);
        showInstruction();
    }

    public void onClick(View sharedView) {
        int id = sharedView.getId();
        Class activityClass;
        String transitionName;
        switch (id) {
            case R.id.iv_about_me:
                activityClass = AboutMeActivity.class;
                transitionName = getString(R.string.ma_about_me_transition);
                break;
            case R.id.iv_experience:
                activityClass = ExperienceActivity.class;
                transitionName = getString(R.string.ma_experience_transition);
                break;
            case R.id.iv_projects:
                activityClass = ProjectsActivity.class;
                transitionName = getString(R.string.ma_projects_transition);
                break;
            case R.id.iv_technologies:
                activityClass = TechnologiesActivity.class;
                transitionName = getString(R.string.ma_technologies_transition);
                break;
            default:
                activityClass = ContactActivity.class;
                transitionName = getString(R.string.ma_contact_transition);
                break;
        }

        ActivityOptions transitionActivityOptions = makeSceneTransitionAnimation(MainActivity.this, sharedView, transitionName);
        startActivity(new Intent(mContext, activityClass), transitionActivityOptions.toBundle());
    }

    private void showInstruction() {
        ViewTarget target = new ViewTarget(R.id.iv_projects, this);
        new ShowcaseView.Builder(this)
                .setTarget(target)
                .setStyle(R.style.CustomShowcaseTheme)
                .setContentTitle(getString(R.string.ma_welcome_CV))
                .setContentText(getString(R.string.ma_instruction_circle))
                .hideOnTouchOutside()
                .build();
    }

    public void onClickLanguage(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.iv_polish:
                language_code = "PL";
                break;
            case R.id.iv_english:
                language_code = "EN";
                break;
        }

        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale(language_code.toLowerCase()));
        res.updateConfiguration(conf, dm);
        DataBindingUtil.setContentView(this, R.layout.activity_main);
        showInstruction();
    }
}

