package com.jordanschwichtenberg.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Jordan on 2/5/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private Date mDate;

    public Crime() {
        // Generate unique identifier.
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
