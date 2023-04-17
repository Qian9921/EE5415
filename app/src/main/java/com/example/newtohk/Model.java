package com.example.newtohk;

public class Model {
    private String countryName;
    private String countryArea;
    private String Details;
    private int image;

    public String getCountryName() {
        return countryName;
    }

    public String getCountryArea() {
        return countryArea;
    }

    public String getDetails() {
        return Details;
    }

    public int getImage() {
        return image;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryArea(String countryArea) {this.countryArea = countryArea;}

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public void setImage(int image) {
        this.image = image;
    }
}