package com.example.triviacategorylister;

public class Category {

    private String mCategoryName;
    private int mCategoryId;
    private int mImageResourceId;

    public Category(String categoryName, int categoryId, int imageResourceId) {
        this.mCategoryName = categoryName;
        this.mCategoryId = categoryId;
        this.mImageResourceId = imageResourceId;
    }

    public String getmCategoryName() {
        return mCategoryName;
    }

    public int getmCategoryId() {
        return mCategoryId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
