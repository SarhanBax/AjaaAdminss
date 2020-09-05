package com.example.ajaaadmin.models;

import androidx.recyclerview.widget.LinearSmoothScroller;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PassengerDetailsmodel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("passengers")
    private DetailsPessenger passengers;

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

    public DetailsPessenger getPassengers() {
        return passengers;
    }

    public void setPassengers(DetailsPessenger passengers) {
        this.passengers = passengers;
    }

    public static class DetailsPessenger
    {
        @SerializedName("passenger")
        public List<detailsofpassenger> passenger;

        public static class detailsofpassenger
        {
            @SerializedName("id")
            private String id;

            @SerializedName("name")
            private String name;

            @SerializedName("image")
            private String image;

            @SerializedName("contact")
            private String contact;

            @SerializedName("passenger_status")
            private status_passenger passenger_status;

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

            public status_passenger getPassenger_status() {
                return passenger_status;
            }

            public void setPassenger_status(status_passenger passenger_status) {
                this.passenger_status = passenger_status;
            }

            public static class status_passenger
            {
                @SerializedName("user_id")
                private String user_id;

                @SerializedName("user_status")
                private String user_status;

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public String getUser_status() {
                    return user_status;
                }

                public void setUser_status(String user_status) {
                    this.user_status = user_status;
                }
            }
        }
        @SerializedName("type")
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
