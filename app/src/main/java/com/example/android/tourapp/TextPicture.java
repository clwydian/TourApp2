package com.example.android.tourapp;

/**
 * @link TextPicture is a block of text plus an image - description and image descriptee
 */
public class TextPicture {

    /**
     * Default translation for the word
     */
    private String mdescription;

    /**
     * Image resource ID for the associated picture
     */
    private int mPictureID;

    /**
     * Construct a TextPicture object
     *
     * @param description is the descriptor for the image
     * @param pictureID   is the integer index to the associated image
     */

    public TextPicture(String description, int pictureID) {
        mdescription = description;
        mPictureID = pictureID;
    }

    /**
     * Get the description.
     */
    public String getDescription() {
        return mdescription;
    }

    /**
     * Get the imageID.
     */
    public int getPictureID() {
        return mPictureID;
    }

}

