package com.bezets.cityappar.categories;

/**
 * Created by Bezet on 06/04/2017.
 */

public class CategoryModel {
    String categoryId;
    String categoryName;
    String iconFileName;

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getIconFileName() {
        return iconFileName;
    }
}
