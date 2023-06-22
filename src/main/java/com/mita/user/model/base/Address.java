package com.mita.user.model.base;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    // home | work | temp | old - purpose of this address
    private String use;

    // postal | physical | both
    private String type;

    // Text representation of the address
    private String text;

    // Street name, number, direction & P.O. Box etc.
    private List<String> line;

    // Name of city, town etc.
    private String city;

    // District name (aka county)
    private String district;

    // Sub-unit of country (abbreviations ok)
    private String state;

    // Coordinates of the Address
    private GeoLocation geo;

    // Postal code for area
    private String postalCode;

    // Country (can be ISO 3166 3 letter code)
    private String country;

    // Time period when address was/is in use
    private long startTime;
    private long endTime;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public GeoLocation getGeo() {
        return geo;
    }

    public void setGeo(GeoLocation geo) {
        this.geo = geo;
    }

}
