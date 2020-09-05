package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DriverHistoryModel
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

    @SerializedName("driver_ride_history")
    private List<Driver_ride_history> driver_ride_history;

    public List<Driver_ride_history> getDriver_ride_history() {
        return driver_ride_history;
    }

    public void setDriver_ride_history(List<Driver_ride_history> driver_ride_history) {
        this.driver_ride_history = driver_ride_history;
    }

    public static class Driver_ride_history
    {
        @SerializedName("id")
        private String id;

        @SerializedName("user_id")
        private String user_id;

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

        @SerializedName("passenger_count")
        private String passenger_count;

        @SerializedName("ride_mode")
        private String ride_mode;

        @SerializedName("fare")
        private String fare;

        @SerializedName("book_date")
        private String book_date;

        @SerializedName("distance")
        private String distance;

        @SerializedName("duration")
        private String duration;

        @SerializedName("ride_status")
        private String ride_status;

        @SerializedName("user")
        private User user;

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

        public String getBook_date() {
            return book_date;
        }

        public void setBook_date(String book_date) {
            this.book_date = book_date;
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

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public static class User
        {
            @SerializedName("id")
            private String id;

            @SerializedName("name")
            private String name;

            @SerializedName("image")
            private String image;

            @SerializedName("contact")
            private String contact;

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
        }

    }
}
