package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** an integer to hold the resource id*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Miwok translation for the word */
    private int mAudioId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioId is the audio res id for that word
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }
    /**
     * create another constructor for passing different arguments
     @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     @param miwokTranslation is the word in the Miwok language
     @param resourceId is the id for the image source
     @param audioId is the audio res id for that word
     */
     public Word(String defaultTranslation, String miwokTranslation,int resourceId,int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
        mAudioId = audioId;
     }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image id
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }
    /**
     * returns whether the image is present or not
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the audio of the word.
     */
    public int audioFile() {
        return mAudioId;
    }
}
