package com.example.david.dawidpiechaczekcv.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.david.dawidpiechaczekcv.R;
import com.example.david.dawidpiechaczekcv.databinding.ActivityAboutmeBinding;
import com.example.david.dawidpiechaczekcv.view_model.AboutMeViewModel;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

/**
 * Created by David on 2016-12-13.
 */

public class AboutMeActivity extends AppCompatActivity {

    private AboutMeViewModel mAboutMeViewModel;
    private ActivityAboutmeBinding binding;
    private HTextView hTextView, hTextView2;
    private int mCounter = 0;
    private String[] sentences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_aboutme);
        initComponents();
        setAnimations();
    }

    public void onClick(View v) {
        mCounter = mCounter >= sentences.length - 1 ? 0 : mCounter + 1;
        hTextView2.animateText(sentences[mCounter]);
    }

    private void initComponents() {
        mAboutMeViewModel = new AboutMeViewModel(getResources());
        binding.setViewModel(mAboutMeViewModel);
        sentences = getResources().getStringArray(R.array.ama_quote);

        hTextView = (HTextView) findViewById(R.id.aa_htv_name);
        hTextView2 = (HTextView) findViewById(R.id.aa_htv_quote);
    }

    private void setAnimations() {
        hTextView.setAnimateType(HTextViewType.ANVIL);
        hTextView2.setAnimateType(HTextViewType.EVAPORATE);
        hTextView.animateText(getString(R.string.ama_name));
        hTextView2.animateText(getResources().getStringArray(R.array.ama_quote)[0]);
    }
}

