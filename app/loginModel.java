package com.example.formretrofit;

import com.google.gson.annotations.SerializedName;

public class loginModel
{
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private Loginmessage message;

    @SerializedName("user")
    private Loginuser user;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loginmessage getMessage() {
        return message;
    }

    public void setMessage(Loginmessage message) {
        this.message = message;
    }

    public Loginuser getUser() {
        return user;
    }

    public void setUser(Loginuser user) {
        this.user = user;
    }

    public class Loginmessage
    {
        @SerializedName("token")
        private String token;

        @SerializedName("token_type")
        private String token_type;

        @SerializedName("message")
        private String message;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getToken_type() {
            return token_type;
        }

        public void setToken_type(String token_type) {
            this.token_type = token_type;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class Loginuser
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

        @SerializedName("is_admin")
        private String is_admin;

        @SerializedName("status")
        private String status;

        @SerializedName("created_at")
        private String created_at;

        @SerializedName("updated_at")
        private String updated_at;

        @SerializedName("bank_details")
        private String bank_details;

        @SerializedName("user_type")
        private String user_type;

        @SerializedName("passenger_status")
        private Passangerstatus passanger_status;

        @SerializedName("driver_status")
        private String driver_status;

        @SerializedName("admin_status")
        private String admin_status;

        @SerializedName("driver_app_status")
        private String driver_app_status;

        @SerializedName("driver_vehicle_details")
        private String driver_vehicle_details;

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

        public String isIs_driver() {
            return is_driver;
        }

        public void setIs_driver(String is_driver) {
            this.is_driver = is_driver;
        }

        public String isIs_admin() {
            return is_admin;
        }

        public void setIs_admin(String is_admin) {
            this.is_admin = is_admin;
        }

        public String  isStatus() {
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

        public String getBank_details() {
            return bank_details;
        }

        public void setBank_details(String bank_details) {
            this.bank_details = bank_details;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public Passangerstatus getPassanger_status() {
            return passanger_status;
        }

        public void setPassanger_status(Passangerstatus passanger_status) {
            this.passanger_status = passanger_status;
        }

        public String getDriver_status() {
            return driver_status;
        }

        public void setDriver_status(String driver_status) {
            this.driver_status = driver_status;
        }

        public String getAdmin_status() {
            return admin_status;
        }

        public void setAdmin_status(String admin_status) {
            this.admin_status = admin_status;
        }

        public String getDriver_app_status() {
            return driver_app_status;
        }

        public void setDriver_app_status(String driver_app_status) {
            this.driver_app_status = driver_app_status;
        }

        public String getDriver_vehicle_details() {
            return driver_vehicle_details;
        }

        public void setDriver_vehicle_details(String driver_vehicle_details) {
            this.driver_vehicle_details = driver_vehicle_details;
        }

        public static class Passangerstatus
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
}
