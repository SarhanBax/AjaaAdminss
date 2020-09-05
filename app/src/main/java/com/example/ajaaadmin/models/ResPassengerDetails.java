package com.example.ajaaadmin.models;

import com.example.ajaaadmin.PassengerDetails;
import com.google.gson.annotations.SerializedName;

public class ResPassengerDetails
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("passenger_details")
    private PassengerDetails passenger_details;

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

    public PassengerDetails getPassenger_details() {
        return passenger_details;
    }

    public void setPassenger_details(PassengerDetails passenger_details) {
        this.passenger_details = passenger_details;
    }

    public static class PassengerDetails
    {
        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("email")
        private String email;

        @SerializedName("image")
        private String image;

        @SerializedName("gender")
        private String gender;

        @SerializedName("contact")
        private String contact;

        @SerializedName("city_id")
        private String city_id;

        @SerializedName("referral_code")
        private String referral_code;

        @SerializedName("refer_from_id")
        private String refer_from_id;

        @SerializedName("referral_count")
        private String referral_count;

        @SerializedName("otp")
        private String otp;

        @SerializedName("is_passenger")
        private String is_passenger;

        @SerializedName("is_driver")
        private String is_driver;

        @SerializedName("admin")
        private String admin;

        @SerializedName("status")
        private String status;

        @SerializedName("created_at")
        private String created_at;

        @SerializedName("updated_at")
        private String updated_at;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getReferral_code() {
            return referral_code;
        }

        public void setReferral_code(String referral_code) {
            this.referral_code = referral_code;
        }

        public String getRefer_from_id() {
            return refer_from_id;
        }

        public void setRefer_from_id(String refer_from_id) {
            this.refer_from_id = refer_from_id;
        }

        public String getReferral_count() {
            return referral_count;
        }

        public void setReferral_count(String referral_count) {
            this.referral_count = referral_count;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getIs_passenger() {
            return is_passenger;
        }

        public void setIs_passenger(String is_passenger) {
            this.is_passenger = is_passenger;
        }

        public String getIs_driver() {
            return is_driver;
        }

        public void setIs_driver(String is_driver) {
            this.is_driver = is_driver;
        }

        public String getAdmin() {
            return admin;
        }

        public void setAdmin(String admin) {
            this.admin = admin;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
