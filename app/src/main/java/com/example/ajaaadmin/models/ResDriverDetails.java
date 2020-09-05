package com.example.ajaaadmin.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResDriverDetails
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("driver_details")
    private Driverdetails driver_details;

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

    public Driverdetails getDriver_details() {
        return driver_details;
    }

    public void setDriver_details(Driverdetails driver_details) {
        this.driver_details = driver_details;
    }

    public static class Driverdetails
    {
        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("cityname")
        private String cityname;

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
        private String referral_Code;

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

        @SerializedName("is_admin")
        private String is_admin;

        @SerializedName("status")
        private String status;

        @SerializedName("created_at")
        private String created_at;

        @SerializedName("updated_at")
        private String updated_at;

        @SerializedName("vehicle_details")
        private Vehicle_details vehicle_details;

        @SerializedName("driver_status")
        private Driver_status driver_status;

        @SerializedName("driver_bank_details")
        private Driver_bank_details driver_bank_details;


        @SerializedName("fcm_token")
        private Fcm_token fcm_token;

        public String getId() {
            return id;
        }

        public String getCityname()
        {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
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

        public Vehicle_details getVehicle_details() {
            return vehicle_details;
        }

        public void setVehicle_details(Vehicle_details vehicle_details) {
            this.vehicle_details = vehicle_details;
        }


        public Driver_status getDriver_status() {
            return driver_status;
        }

        public void setDriver_status(Driver_status driver_status) {
            this.driver_status = driver_status;
        }

        public Driver_bank_details getDriver_bank_details() {
            return driver_bank_details;
        }

        public void setDriver_bank_details(Driver_bank_details driver_bank_details) {
            this.driver_bank_details = driver_bank_details;
        }

        public Fcm_token getFcm_token() {
            return fcm_token;
        }

        public void setFcm_token(Fcm_token fcm_token) {
            this.fcm_token = fcm_token;
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

        public String getReferral_Code() {
            return referral_Code;
        }

        public void setReferral_Code(String referral_Code) {
            this.referral_Code = referral_Code;
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

        public String getIs_admin() {
            return is_admin;
        }

        public void setIs_admin(String is_admin) {
            this.is_admin = is_admin;
        }

        public static class Vehicle_details
        {
            @SerializedName("id")
            private String id;

            @SerializedName("user_id")
            private String user_id;

            @SerializedName("type_id")
            private String type_id;

            @SerializedName("car_cat_name")
            private String car_cat_name;

            @SerializedName("vehicle_no")
            private String vehicle_no;

            @SerializedName("vehicle_name")
            private String vehicle_name;

            @SerializedName("front_image")
            private String front_image;

            @SerializedName("description")
            private String description;

            @SerializedName("license_no")
            private String license_no;

            @SerializedName("license_expiry")
            private String license_expiry;

            @SerializedName("front_license")
            private String front_license;

            @SerializedName("back_license")
            private String back_license;

            @SerializedName("rc_book_no")
            private String rc_book_no;

            @SerializedName("rc_book_expiry")
            private String rc_book_expiry;

            @SerializedName("front_rc_book")
            private String front_rc_book;

            @SerializedName("back_rc_book")
            private String back_rc_book;

            @SerializedName("mode")
            private String mode;

            @SerializedName("status")
            private String status;

            @SerializedName("created_at")
            private String updated_at;

            @SerializedName("vehicle_type")
            private Vehicle_type vehicle_type;

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

            public String getVehicle_no() {
                return vehicle_no;
            }

            public void setVehicle_no(String vehicle_no) {
                this.vehicle_no = vehicle_no;
            }

            public String getVehicle_name() {
                return vehicle_name;
            }

            public void setVehicle_name(String vehicle_name) {
                this.vehicle_name = vehicle_name;
            }

            public String getFront_image() {
                return front_image;
            }

            public void setFront_image(String front_image) {
                this.front_image = front_image;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLicense_no() {
                return license_no;
            }

            public void setLicense_no(String license_no) {
                this.license_no = license_no;
            }

            public String getLicense_expiry() {
                return license_expiry;
            }

            public void setLicense_expiry(String license_expiry) {
                this.license_expiry = license_expiry;
            }

            public String getFront_license() {
                return front_license;
            }

            public void setFront_license(String front_license) {
                this.front_license = front_license;
            }

            public String getBack_license() {
                return back_license;
            }

            public void setBack_license(String back_license) {
                this.back_license = back_license;
            }

            public String getRc_book_no() {
                return rc_book_no;
            }

            public void setRc_book_no(String rc_book_no) {
                this.rc_book_no = rc_book_no;
            }

            public String getRc_book_expiry() {
                return rc_book_expiry;
            }

            public void setRc_book_expiry(String rc_book_expiry) {
                this.rc_book_expiry = rc_book_expiry;
            }

            public String getFront_rc_book() {
                return front_rc_book;
            }

            public void setFront_rc_book(String front_rc_book) {
                this.front_rc_book = front_rc_book;
            }

            public String getBack_rc_book() {
                return back_rc_book;
            }

            public void setBack_rc_book(String back_rc_book) {
                this.back_rc_book = back_rc_book;
            }

            public String getMode() {
                return mode;
            }

            public void setMode(String mode) {
                this.mode = mode;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public Vehicle_type getVehicle_type() {
                return vehicle_type;
            }

            public void setVehicle_type(Vehicle_type vehicle_type) {
                this.vehicle_type = vehicle_type;
            }

            public static class Vehicle_type
            {
                @SerializedName("id")
                private String id;

                @SerializedName("vehicle_name")
                private String vehicle_name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getVehicle_name() {
                    return vehicle_name;
                }

                public void setVehicle_name(String vehicle_name) {
                    this.vehicle_name = vehicle_name;
                }
            }
        }

        @SerializedName("reviews")
        private List<Reviews> reviews;


        public static class Reviews
        {
            @SerializedName("id")
            private String id;

            @SerializedName("flag")
            private String status;

            @SerializedName("driver_id")
            private String driver_id;

            @SerializedName("passenger_id")
            private String passenger_id;

            @SerializedName("star")
            private String star;

            @SerializedName("created_at")
            private String created_at;

            @SerializedName("updated_at")
            private String updated_at;

            @SerializedName("passenger")
            private Passenger passenger;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDriver_id() {
                return driver_id;
            }

            public void setDriver_id(String driver_id) {
                this.driver_id = driver_id;
            }

            public String getPassenger_id() {
                return passenger_id;
            }

            public void setPassenger_id(String passenger_id) {
                this.passenger_id = passenger_id;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
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

            public Passenger getPassenger() {
                return passenger;
            }

            public void setPassenger(Passenger passenger) {
                this.passenger = passenger;
            }

            public static class Passenger
            {
                @SerializedName("id")
                private String id;

                @SerializedName("name")
                private String name;

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
            }
        }

        public static class Driver_status
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

        public static class Driver_bank_details
        {
            @SerializedName("id")
            private String id;

            @SerializedName("ac_holder_name")
            private String ac_holder_name;

            @SerializedName("bank_name")
            private String bank_name;

            @SerializedName("ac_no")
            private String ac_no;

            @SerializedName("ifsc")
            private String ifsc;

            @SerializedName("user_id")
            private String user_id;

            @SerializedName("user_type")
            private String user_type;

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

            public String getAc_holder_name() {
                return ac_holder_name;
            }

            public void setAc_holder_name(String ac_holder_name) {
                this.ac_holder_name = ac_holder_name;
            }

            public String getBank_name() {
                return bank_name;
            }

            public void setBank_name(String bank_name) {
                this.bank_name = bank_name;
            }

            public String getAc_no() {
                return ac_no;
            }

            public void setAc_no(String ac_no) {
                this.ac_no = ac_no;
            }

            public String getIfsc() {
                return ifsc;
            }

            public void setIfsc(String ifsc) {
                this.ifsc = ifsc;
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

        @SerializedName("assign_ride")
        public List<Assign_ride> assign_rides;

        public static class Assign_ride
        {

        }

        public static class Fcm_token
        {
            @SerializedName("id")
            private String id;

            @SerializedName("user_id")
            private String user_id;

            @SerializedName("token")
            private String token;

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

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
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
}
