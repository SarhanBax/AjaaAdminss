package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RefundModel
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

    @SerializedName("rides")
    private List<Rides> rides;

    public List<Rides> getRides() {
        return rides;
    }

    public void setRides(List<Rides> rides) {
        this.rides = rides;
    }

    public static class Rides
    {
        @SerializedName("id")
        private String id;

        @SerializedName("user_id")
        private String user_id;

        @SerializedName("user_type")
        private String user_type;

        @SerializedName("source_latitude")
        private String source_latitude;

        @SerializedName("source_longitude")
        private String source_longitude;

        @SerializedName("source_address")
        private String source_address;

        @SerializedName("destination_latitude")
        private String destination_latitude;

        @SerializedName("destination_longitude")
        private String destination_longitude;

        @SerializedName("destination_address")
        private String destination_address;

        @SerializedName("driver_gender")
        private String driver_gender;

        @SerializedName("vehicle_type_id")
        private String vehicle_type_id;

        @SerializedName("vehicle_cat_name")
        private String vehicle_cat_name;

        @SerializedName("passenger_count")
        private String passenger_count;

        @SerializedName("ride_mode")
        private String ride_mode;

        @SerializedName("fare")
        private String fare;

        @SerializedName("partial_first_part")
        private String partial_first_part;

        @SerializedName("partial_second_part")
        private String partial_second_part;

        @SerializedName("otp")
        private String otp;

        @SerializedName("book_time")
        private String book_time;

        @SerializedName("book_date")
        private String book_date;

        @SerializedName("waiting_time")
        private String waiting_time;

        @SerializedName("waiting_charges")
        private String waiting_charges;

        @SerializedName("end_time")
        private String end_time;

        @SerializedName("end_date")
        private String end_date;

        @SerializedName("ride_status")
        private String ride_status;

        @SerializedName("canceled_by")
        private String canceled_by;

        @SerializedName("passenger_reason_id")
        private String passenger_reason_id;

        @SerializedName("driver_latitude")
        private String driver_latitude;

        @SerializedName("driver_longitude")
        private String driver_longitude;

        @SerializedName("distance")
        private String distance;

        @SerializedName("duration")
        private String duration;

        @SerializedName("city_id")
        private String city_id;

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

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public String getSource_latitude() {
            return source_latitude;
        }

        public void setSource_latitude(String source_latitude) {
            this.source_latitude = source_latitude;
        }

        public String getSource_longitude() {
            return source_longitude;
        }

        public void setSource_longitude(String source_longitude) {
            this.source_longitude = source_longitude;
        }

        public String getSource_address() {
            return source_address;
        }

        public void setSource_address(String source_address) {
            this.source_address = source_address;
        }

        public String getDestination_latitude() {
            return destination_latitude;
        }

        public void setDestination_latitude(String destination_latitude) {
            this.destination_latitude = destination_latitude;
        }

        public String getDestination_longitude() {
            return destination_longitude;
        }

        public void setDestination_longitude(String destination_longitude) {
            this.destination_longitude = destination_longitude;
        }

        public String getDestination_address() {
            return destination_address;
        }

        public void setDestination_address(String destination_address) {
            this.destination_address = destination_address;
        }

        public String getDriver_gender() {
            return driver_gender;
        }

        public void setDriver_gender(String driver_gender) {
            this.driver_gender = driver_gender;
        }

        public String getVehicle_type_id() {
            return vehicle_type_id;
        }

        public void setVehicle_type_id(String vehicle_type_id) {
            this.vehicle_type_id = vehicle_type_id;
        }

        public String getVehicle_cat_name() {
            return vehicle_cat_name;
        }

        public void setVehicle_cat_name(String vehicle_cat_name) {
            this.vehicle_cat_name = vehicle_cat_name;
        }

        public String getPassenger_count() {
            return passenger_count;
        }

        public void setPassenger_count(String passenger_count) {
            this.passenger_count = passenger_count;
        }

        public String getRide_mode() {
            return ride_mode;
        }

        public void setRide_mode(String ride_mode) {
            this.ride_mode = ride_mode;
        }

        public String getFare() {
            return fare;
        }

        public void setFare(String fare) {
            this.fare = fare;
        }

        public String getPartial_first_part() {
            return partial_first_part;
        }

        public void setPartial_first_part(String partial_first_part) {
            this.partial_first_part = partial_first_part;
        }

        public String getPartial_second_part() {
            return partial_second_part;
        }

        public void setPartial_second_part(String partial_second_part) {
            this.partial_second_part = partial_second_part;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getBook_time() {
            return book_time;
        }

        public void setBook_time(String book_time) {
            this.book_time = book_time;
        }

        public String getBook_date() {
            return book_date;
        }

        public void setBook_date(String book_date) {
            this.book_date = book_date;
        }

        public String getWaiting_time() {
            return waiting_time;
        }

        public void setWaiting_time(String waiting_time) {
            this.waiting_time = waiting_time;
        }

        public String getWaiting_charges() {
            return waiting_charges;
        }

        public void setWaiting_charges(String waiting_charges) {
            this.waiting_charges = waiting_charges;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getRide_status() {
            return ride_status;
        }

        public void setRide_status(String ride_status) {
            this.ride_status = ride_status;
        }

        public String getCanceled_by() {
            return canceled_by;
        }

        public void setCanceled_by(String canceled_by) {
            this.canceled_by = canceled_by;
        }

        public String getPassenger_reason_id() {
            return passenger_reason_id;
        }

        public void setPassenger_reason_id(String passenger_reason_id) {
            this.passenger_reason_id = passenger_reason_id;
        }

        public String getDriver_latitude() {
            return driver_latitude;
        }

        public void setDriver_latitude(String driver_latitude) {
            this.driver_latitude = driver_latitude;
        }

        public String getDriver_longitude() {
            return driver_longitude;
        }

        public void setDriver_longitude(String driver_longitude) {
            this.driver_longitude = driver_longitude;
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

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
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
