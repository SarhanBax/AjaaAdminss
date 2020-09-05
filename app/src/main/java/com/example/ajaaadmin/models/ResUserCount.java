package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

public class ResUserCount
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("counts")
    private count counts;

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

    public count getCounts() {
        return counts;
    }

    public void setCounts(count counts) {
        this.counts = counts;
    }

    public ResUserCount(String status, String message, count counts) {
        this.status = status;
        this.message = message;
        this.counts = counts;
    }

    public static class count
    {
        @SerializedName("total_users")
        private String total_users;

        @SerializedName("passenger")
        private String passenger;

        @SerializedName("driver")
        private String driver;

        @SerializedName("driver_passenger")
        private String driver_passenger;

        @SerializedName("online_driver")
        private String online_driver;

        @SerializedName("pending_driver")
        private String pending_driver;

        @SerializedName("rejected_driver")
        private String rejected_driver;

        @SerializedName("approved_driver")
        private String approverd_driver;

        @SerializedName("rides_canceled")
        private String rides_canceled;

        @SerializedName("rides_booked")
        private String rides_booked;

        @SerializedName("rides_ongoing")
        private String rides_ongoing;

        @SerializedName("rides_pending")
        private String rides_pending;

        @SerializedName("rides_completed")
        private String rides_completed;

        @SerializedName("bikes")
        private String bikes;

        @SerializedName("car")
        private String car;

        @SerializedName("rickshaw")
        private String rickshaw;

        @SerializedName("sedan")
        private String sedan;

        @SerializedName("hatchback")
        private String hatchback;

        @SerializedName("xl")
        private String xl;

        public String getTotal_users() {
            return total_users;
        }

        public void setTotal_users(String total_users) {
            this.total_users = total_users;
        }

        public String getPassenger() {
            return passenger;
        }

        public void setPassenger(String passenger) {
            this.passenger = passenger;
        }

        public String getDriver() {
            return driver;
        }

        public void setDriver(String driver) {
            this.driver = driver;
        }

        public String getDriver_passenger() {
            return driver_passenger;
        }

        public void setDriver_passenger(String driver_passenger) {
            this.driver_passenger = driver_passenger;
        }

        public String getOnline_driver() {
            return online_driver;
        }

        public void setOnline_driver(String online_driver) {
            this.online_driver = online_driver;
        }

        public String getPending_driver() {
            return pending_driver;
        }

        public void setPending_driver(String pending_driver) {
            this.pending_driver = pending_driver;
        }

        public String getRejected_driver() {
            return rejected_driver;
        }

        public void setRejected_driver(String rejected_driver) {
            this.rejected_driver = rejected_driver;
        }

        public String getApproverd_driver() {
            return approverd_driver;
        }

        public void setApproverd_driver(String approverd_driver) {
            this.approverd_driver = approverd_driver;
        }

        public String getRides_canceled() {
            return rides_canceled;
        }

        public void setRides_canceled(String rides_canceled) {
            this.rides_canceled = rides_canceled;
        }

        public String getRides_booked() {
            return rides_booked;
        }

        public void setRides_booked(String rides_booked) {
            this.rides_booked = rides_booked;
        }

        public String getRides_ongoing() {
            return rides_ongoing;
        }

        public void setRides_ongoing(String rides_ongoing) {
            this.rides_ongoing = rides_ongoing;
        }

        public String getRides_pending() {
            return rides_pending;
        }

        public void setRides_pending(String rides_pending) {
            this.rides_pending = rides_pending;
        }

        public String getRides_completed() {
            return rides_completed;
        }

        public void setRides_completed(String rides_completed) {
            this.rides_completed = rides_completed;
        }

        public String getBikes() {
            return bikes;
        }

        public void setBikes(String bikes) {
            this.bikes = bikes;
        }

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public String getRickshaw() {
            return rickshaw;
        }

        public void setRickshaw(String rickshaw) {
            this.rickshaw = rickshaw;
        }

        public String getSedan() {
            return sedan;
        }

        public void setSedan(String sedan) {
            this.sedan = sedan;
        }

        public String getHatchback() {
            return hatchback;
        }

        public void setHatchback(String hatchback) {
            this.hatchback = hatchback;
        }

        public String getXl() {
            return xl;
        }

        public count(String total_users, String passenger, String driver, String driver_passenger, String online_driver, String pending_driver, String rejected_driver, String approverd_driver, String rides_canceled, String rides_booked, String rides_ongoing, String rides_pending, String rides_completed, String bikes, String car, String rickshaw, String sedan, String hatchback, String xl) {
            this.total_users = total_users;
            this.passenger = passenger;
            this.driver = driver;
            this.driver_passenger = driver_passenger;
            this.online_driver = online_driver;
            this.pending_driver = pending_driver;
            this.rejected_driver = rejected_driver;
            this.approverd_driver = approverd_driver;
            this.rides_canceled = rides_canceled;
            this.rides_booked = rides_booked;
            this.rides_ongoing = rides_ongoing;
            this.rides_pending = rides_pending;
            this.rides_completed = rides_completed;
            this.bikes = bikes;
            this.car = car;
            this.rickshaw = rickshaw;
            this.sedan = sedan;
            this.hatchback = hatchback;
            this.xl = xl;
        }

        public void setXl(String xl) {
            this.xl = xl;
        }
    }
}
