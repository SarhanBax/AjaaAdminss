package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Paymentmodel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("driver")
    private Driver driver;

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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public static class Driver
    {
        @SerializedName("fares")
        private List<Fares> fares;

        public List<Fares> getFares() {
            return fares;
        }

        public void setFares(List<Fares> fares) {
            this.fares = fares;
        }

        public static class Fares
        {
            @SerializedName("id")
            private String id;

            @SerializedName("source")
            private String source;

            @SerializedName("destination")
            private String destination;

            @SerializedName("fare_deducted")
            private String fare_deducted;

            @SerializedName("fare")
            private String fare;

            @SerializedName("payment")
            private String payment;

            @SerializedName("status")
            private String status;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getFare_deducted() {
                return fare_deducted;
            }

            public void setFare_deducted(String fare_deducted) {
                this.fare_deducted = fare_deducted;
            }

            public String getFare() {
                return fare;
            }

            public void setFare(String fare) {
                this.fare = fare;
            }

            public String getPayment() {
                return payment;
            }

            public void setPayment(String payment) {
                this.payment = payment;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
    }
}
