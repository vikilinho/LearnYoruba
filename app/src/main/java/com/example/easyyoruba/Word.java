package com.example.easyyoruba;

public class Word {
    private String mDefaultTranslation;
    private String mYorubaTranslation;
    public Word (String DefaultTranslation, String YorubaTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mYorubaTranslation = YorubaTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getYorubaTranslation() {
        return mYorubaTranslation;
    }
}
