package com.example.android.miwok;

/**
 * Created by msi on 1/30/2017.
 */

public  class Word {
    private String mmDefaultTranslation;
    private String mMiwakTranslation;
    int mResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public  Word(String defaultTranslation,String miwaktranslation,int resourceID, int audioResourceId){
        mMiwakTranslation =miwaktranslation;
        mmDefaultTranslation =defaultTranslation;
        mResourceId  = resourceID;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation,String miwaktranslation, int audioResourceId){
        mMiwakTranslation = miwaktranslation;
        mmDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getMiwakTranslation(){
        return mMiwakTranslation;
    }

    public String getdefaultTranslation(){
        return mmDefaultTranslation;
    }

    public int getImageResourceID(){
        return mResourceId;
    }

    public boolean hasImage(){
        return mResourceId !=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mmDefaultTranslation='" + mmDefaultTranslation + '\'' +
                ", mMiwakTranslation='" + mMiwakTranslation + '\'' +
                ", mResourceId=" + mResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
