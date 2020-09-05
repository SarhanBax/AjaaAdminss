package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Todaysridemodel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

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
    @SerializedName("today_rides")
    private List<Today_ride> today_rides;

    public List<Today_ride> getToday_rides() {
        return today_rides;
    }

    public void setToday_rides(List<Today_ride> today_rides) {
        this.today_rides = today_rides;
    }

    public static class Today_ride
    {
        @SerializedName("driver_id")
        private String driver_id;

        @SerializedName("driver_name")
        private String driver_name;

        @SerializedName("driver_contact")
        private String driver_contact;

        @SerializedName("ride_id")
        private String ride_id;

        @SerializedName("source_address")
        private String source_address;

        @SerializedName("destination_address")
        private String destination_address;

        @SerializedName("passenger_count")
        private String passenger_count;

        @SerializedName("fare")
        private String fare;

        @SerializedName("distance")
        private String distance;

        @SerializedName("duration")
        private String duration;

        @SerializedName("ride_status")
        private String ride_status;

        @SerializedName("book_date")
        private String book_date;

        @SerializedName("end_date")
        private String end_date;

        @SerializedName("passenger_id")
        private String passenger_id;

        @SerializedName("passenger_name")
        private String passenger_name;

        @SerializedName("passenger_contact")
        private String passenger_contact;

        public String getDriver_id() {
            return driver_id;
        }

        public void setDriver_id(String driver_id) {
            this.driver_id = driver_id;
        }

        public String getDriver_name() {
            return driver_name;
        }

        public void setDriver_name(String driver_name) {
            this.driver_name = driver_name;
        }

        public String getDriver_contact() {
            return driver_contact;
        }

        public void setDriver_contact(String driver_contact) {
            this.driver_contact = driver_contact;
        }

        public String getRide_id() {
            return ride_id;
        }

        public void setRide_id(String ride_id) {
            this.ride_id = ride_id;
        }

        public String getSource_address() {
            return source_address;
        }

        public void setSource_address(String source_address) {
            this.source_address = source_address;
        }

        public String getDestination_address() {
            return destination_address;
        }

        public void setDestination_address(String destination_address) {
            this.destination_address = destination_address;
        }

        public String getPassenger_count() {
            return passenger_count;
        }

        public void setPassenger_count(String passenger_count) {
            this.passenger_count = passenger_count;
        }

        public String getFare() {
            return fare;
        }

        public void setFare(String fare) {
            this.fare = fare;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getRide_status() {
            return ride_status;
        }

        public void setRide_status(String ride_status) {
            this.ride_status = ride_status;
        }

        public String getBook_date() {
            return book_date;
        }

        public void setBook_date(String book_date) {
            this.book_date = book_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getPassenger_id() {
            return passenger_id;
        }

        public void setPassenger_id(String passenger_id) {
            this.passenger_id = passenger_id;
        }

        public String getPassenger_name() {
            return passenger_name;
        }

        public void setPassenger_name(String passenger_name) {
            this.passenger_name = passenger_name;
        }

        public String getPassenger_contact() {
            return passenger_contact;
        }

        public void setPassenger_contact(String passenger_contact) {
            this.passenger_contact = passenger_contact;
        }
    }
}
