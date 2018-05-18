package com.example.admin.mylovelyplace.data.model;

/**
 * Created by admin on 7/17/2017.
 */

public class Place {
    private String placeID;
    private String placeCategoryID;
    private byte[] placeImage;
    private String placeName;
    private String placeAddress;
    private String placeDescription;
    private double placeLat;
    private double placeLng;

    public Place() {
    }

    public Place (Builder builder) {
        this.placeID = builder.placeID;
        this.placeCategoryID = builder.placeCategoryID;
        this.placeImage = builder.placeImage;
        this.placeName = builder.placeName;
        this.placeAddress = builder.placeAddress;
        this.placeDescription = builder.placeDescription;
        this.placeLat = builder.placeLat;
        this.placeLng = builder.placeLng;
    }

    public String getPlaceID() {
        return placeID;
    }

    public String getPlaceCategoryID() {
        return placeCategoryID;
    }

    public byte[] getPlaceImage() {
        return placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public double getPlaceLat() {
        return placeLat;
    }

    public double getPlaceLng() {
        return placeLng;
    }

    public static class Builder {
        private String placeID;
        private String placeCategoryID;
        private byte[] placeImage;
        private String placeName;
        private String placeAddress;
        private String placeDescription;
        private double placeLat;
        private double placeLng;

        public Builder setPlaceID(String placeID) {
            this.placeID = placeID;
            return this;
        }

        public Builder setPlaceCategoryID(String placeCategoryID) {
            this.placeCategoryID = placeCategoryID;
            return this;
        }

        public Builder setPlaceImage(byte[] placeImage) {
            this.placeImage = placeImage;
            return this;
        }

        public Builder setPlaceName(String placeName) {
            this.placeName = placeName;
            return this;
        }

        public Builder setPlaceAddress(String placeAddress) {
            this.placeAddress = placeAddress;
            return this;
        }

        public Builder setPlaceDescription(String placeDescription) {
            this.placeDescription = placeDescription;
            return this;
        }

        public Builder setPlaceLat(double placeLat) {
            this.placeLat = placeLat;
            return this;
        }

        public Builder setPlaceLng(double placeLng) {
            this.placeLng = placeLng;
            return this;
        }

        public Place builder() {
            return new Place(this);
        }
    }
}