package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Filterdriversmodel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private Message message;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }



    public static class Message
    {
        @SerializedName("count")
        private String count;

        @SerializedName("message")
        private String message;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @SerializedName("filter")
    private List<Filter> filter;

    public List<Filter> getFilter() {
        return filter;
    }

    public void setFilter(List<Filter> filter) {
        this.filter = filter;
    }

    public static class Filter
    {
        @SerializedName("id")
        private String id;

        @SerializedName("username")
        private String username;

        @SerializedName("image")
        private String image;

        @SerializedName("contact")
        private String contact;

        @SerializedName("type_id")
        private String type_id;

        @SerializedName("vehicle_name")
        private String vehicle_name;

        @SerializedName("token")
        private String token;

        @SerializedName("user_status")
        private String user_status;

        @SerializedName("car_status")
        private String car_status;

        @SerializedName("car_category")
        private String car_category;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
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

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
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

        public String getUser_status() {
            return user_status;
        }

        public String setUser_status(String user_status) {
            this.user_status = user_status;
            return user_status;
        }

        public String getCar_status() {
            return car_status;
        }

        public void setCar_status(String car_status) {
            this.car_status = car_status;
        }

        public String getCar_category() {
            return car_category;
        }

        public void setCar_category(String car_category) {
            this.car_category = car_category;
        }
    }
}
