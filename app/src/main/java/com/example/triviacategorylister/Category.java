package com.example.triviacategorylister;

public class Category {

    private String mCategoryName;
    private int mCategoryId;

    public Category(String mCategoryName, int mCategoryId) {
        this.mCategoryName = mCategoryName;
        this.mCategoryId = mCategoryId;
    }

    public String getmCategoryName() {
        return mCategoryName;
    }

    public int getmCategoryId() {
        return mCategoryId;
    }
}
