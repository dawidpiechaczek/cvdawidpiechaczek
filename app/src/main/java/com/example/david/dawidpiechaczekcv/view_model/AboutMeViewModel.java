package com.example.david.dawidpiechaczekcv.view_model;

import android.content.res.Resources;

import com.example.david.dawidpiechaczekcv.R;

/**
 * Created by Dawid on 05.02.2017.
 */

public class AboutMeViewModel {

    private Resources mResources;
    private String mTvBirth1, mTvBirth2, mTvCity1, mTvCity2, mTvUni1, mTvUni2, mTvField, mTvField2,
            mTvFaculty, mTvFaculty2, mTvInterest, mTvInterest2, mTvMarried, mTvMarried2, mTvSkills, mTvSkills2,
            mTvLanguages, mTvLanguages2, mTvCharacter, mTvCharacter2;

    public AboutMeViewModel(Resources resources) {
        mResources = resources;
        setStringsInView();
    }

    private void setStringsInView() {
        mTvBirth1 = mResources.getString(R.string.ama_birth1);
        mTvBirth2 = mResources.getString(R.string.ama_birth2);
        mTvCity1 = mResources.getString(R.string.ama_city);
        mTvCity2 = mResources.getString(R.string.ama_city2);
        mTvUni1 = mResources.getString(R.string.ama_uni);
        mTvUni2 = mResources.getString(R.string.ama_uni2);
        mTvField = mResources.getString(R.string.ama_field);
        mTvField2 = mResources.getString(R.string.ama_field2);
        mTvFaculty = mResources.getString(R.string.ama_faculty);
        mTvFaculty2 = mResources.getString(R.string.ama_faculty2);
        mTvInterest = mResources.getString(R.string.ama_interestings);
        mTvInterest2 = mResources.getString(R.string.ama_interestings2);
        mTvMarried = mResources.getString(R.string.ama_married);
        mTvMarried2 = mResources.getString(R.string.ama_married2);
        mTvSkills = mResources.getString(R.string.ama_skills);
        mTvSkills2 = mResources.getString(R.string.ama_skills2);
        mTvLanguages = mResources.getString(R.string.ama_languages);
        mTvLanguages2 = mResources.getString(R.string.ama_languages2);
        mTvCharacter = mResources.getString(R.string.ama_character);
        mTvCharacter2 = mResources.getString(R.string.ama_character2);

    }

    public String getmTvBirth1() {
        return mTvBirth1;
    }

    public void setmTvBirth1(String mTvBirth1) {
        this.mTvBirth1 = mTvBirth1;
    }

    public String getmTvBirth2() {
        return mTvBirth2;
    }

    public void setmTvBirth2(String mTvBirth2) {
        this.mTvBirth2 = mTvBirth2;
    }

    public String getmTvCity1() {
        return mTvCity1;
    }

    public void setmTvCity1(String mTvCity1) {
        this.mTvCity1 = mTvCity1;
    }

    public String getmTvCity2() {
        return mTvCity2;
    }

    public void setmTvCity2(String mTvCity2) {
        this.mTvCity2 = mTvCity2;
    }

    public String getmTvUni1() {
        return mTvUni1;
    }

    public void setmTvUni1(String mTvUni1) {
        this.mTvUni1 = mTvUni1;
    }

    public String getmTvUni2() {
        return mTvUni2;
    }

    public void setmTvUni2(String mTvUni2) {
        this.mTvUni2 = mTvUni2;
    }

    public String getmTvField() {
        return mTvField;
    }

    public void setmTvField(String mTvField) {
        this.mTvField = mTvField;
    }

    public String getmTvField2() {
        return mTvField2;
    }

    public void setmTvField2(String mTvField2) {
        this.mTvField2 = mTvField2;
    }

    public String getmTvFaculty() {
        return mTvFaculty;
    }

    public void setmTvFaculty(String mTvFaculty) {
        this.mTvFaculty = mTvFaculty;
    }

    public String getmTvFaculty2() {
        return mTvFaculty2;
    }

    public void setmTvFaculty2(String mTvFaculty2) {
        this.mTvFaculty2 = mTvFaculty2;
    }

    public String getmTvInterest() {
        return mTvInterest;
    }

    public void setmTvInterest(String mTvInterest) {
        this.mTvInterest = mTvInterest;
    }

    public String getmTvInterest2() {
        return mTvInterest2;
    }

    public void setmTvInterest2(String mTvInterest2) {
        this.mTvInterest2 = mTvInterest2;
    }

    public String getmTvMarried() {
        return mTvMarried;
    }

    public void setmTvMarried(String mTvMarried) {
        this.mTvMarried = mTvMarried;
    }

    public String getmTvMarried2() {
        return mTvMarried2;
    }

    public void setmTvMarried2(String mTvMarried2) {
        this.mTvMarried2 = mTvMarried2;
    }

    public String getmTvSkills() {
        return mTvSkills;
    }

    public void setmTvSkills(String mTvSkills) {
        this.mTvSkills = mTvSkills;
    }

    public String getmTvSkills2() {
        return mTvSkills2;
    }

    public void setmTvSkills2(String mTvSkills2) {
        this.mTvSkills2 = mTvSkills2;
    }

    public String getmTvLanguages2() {
        return mTvLanguages2;
    }

    public void setmTvLanguages2(String mTvLanguages2) {
        this.mTvLanguages2 = mTvLanguages2;
    }

    public String getmTvLanguages() {
        return mTvLanguages;
    }

    public void setmTvLanguages(String mTvLanguages) {
        this.mTvLanguages = mTvLanguages;
    }

    public String getmTvCharacter2() {
        return mTvCharacter2;
    }

    public void setmTvCharacter2(String mTvCharacter2) {
        this.mTvCharacter2 = mTvCharacter2;
    }

    public String getmTvCharacter() {
        return mTvCharacter;
    }

    public void setmTvCharacter(String mTvCharacter) {
        this.mTvCharacter = mTvCharacter;
    }
}
