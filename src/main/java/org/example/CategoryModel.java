package org.example;

public class CategoryModel {
    private String category;




    public String getCategory() {
        this.category = category;
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "[name=" + category + "]";
    }
}