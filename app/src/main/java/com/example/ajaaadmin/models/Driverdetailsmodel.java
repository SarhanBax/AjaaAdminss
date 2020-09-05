package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Driverdetailsmodel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private  String message;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("driver_details")
    List<DriverDetails> driver_details;

    public List<DriverDetails> getDriver_details() {
        return driver_details;
    }

    public void setDriver_details(List<DriverDetails> driver_details) {
        this.driver_details = driver_details;
    }

    public static class DriverDetails
    {
        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("image")
        private String image;

        @SerializedName("contact")
        private String contact;

        @SerializedName("cityname")
        private String cityname;

        @SerializedName("user_status")
        private String user_status;

        @SerializedName("type_id")
        private String type_id;

        @SerializedName("car_cat_name")
        private String car_cat_name;

        @SerializedName("vehicle_name")
        private String vehicle_name;

        @SerializedName("token")
        private String token;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getCityname() {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
        }

        public String getUser_status() {
            return user_status;
        }

        public void setUser_status(String user_status) {
            this.user_status = user_status;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getCar_cat_name() {
            return car_cat_name;
        }

        public void setCar_cat_name(String car_cat_name) {
            this.car_cat_name = car_cat_name;
        }

        public String getVehicle_name() {
            return vehicle_name;
        }

        public void setVehicle_name(String vehicle_name) {
            this.vehicle_name = vehicle_name;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
