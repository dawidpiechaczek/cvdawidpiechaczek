package com.example.david.dawidpiechaczekcv.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.david.dawidpiechaczekcv.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Dawid on 02.02.2017.
 */

public class ExperienceActivity extends AppCompatActivity {
    @BindView(R.id.ae_iv_experience)
    ImageView imageView;
    @BindView(R.id.ae_iv_experience2)
    ImageView imageView2;
    @BindView(R.id.ae_iv_experience3)
    ImageView imageView3;
    @BindView(R.id.ae_iv_experience4)
    ImageView imageView4;
    @BindView(R.id.ae_iv_experience5)
    ImageView imageView5;
    private TranslateAnimation moveRightTop, moveLeftBottom, moveRightBottom, moveLeftTop;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_experience);
        ButterKnife.bind(this);
        setAnimations();
    }

    private void setAnimations() {
        moveRightTop = new TranslateAnimation(0, 190, 0, 350);
        moveLeftTop = new TranslateAnimation(0, -190, 0, 350);
        moveRightBottom = new TranslateAnimation(0, 190, 0, -350);
        moveLeftBottom = new TranslateAnimation(0, -190, 0, -350);
        moveRightTop.setDuration(1000);
        moveRightBottom.setFillAfter(true);
        moveRightBottom.setDuration(1000);
        moveLeftTop.setFillAfter(true);
        moveLeftTop.setDuration(1000);
        moveRightTop.setFillAfter(true);
        moveLeftBottom.setDuration(1000);
        moveLeftBottom.setFillAfter(true);
    }

    public void onClickAnimate(View v) {
        switch (counter) {
            case 0:
                imageView2.startAnimation(moveLeftTop);
                counter++;
                break;
            case 1:
                imageView3.startAnimation(moveRightTop);
                counter++;
                break;
            case 2:
                imageView4.startAnimation(moveLeftBottom);
                counter++;
                break;
            case 3:
                imageView5.startAnimation(moveRightBottom);
                counter++;
                break;
        }
    }


}
