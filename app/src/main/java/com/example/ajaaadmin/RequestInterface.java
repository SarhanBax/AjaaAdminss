package com.example.ajaaadmin;

import com.example.ajaaadmin.models.CarTypeModel;
import com.example.ajaaadmin.models.DriverHistoryModel;
import com.example.ajaaadmin.models.Driverdetailsmodel;
import com.example.ajaaadmin.models.Filterdriversmodel;
import com.example.ajaaadmin.models.PassengerDetailsmodel;
import com.example.ajaaadmin.models.Paymentmodel;
import com.example.ajaaadmin.models.RefundModel;
import com.example.ajaaadmin.models.ResDriverDetails;
import com.example.ajaaadmin.models.ResPassengerDetails;
import com.example.ajaaadmin.models.ResUserCount;
import com.example.ajaaadmin.models.Todaysridemodel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RequestInterface
{
    @FormUrlEncoded
    @POST("signup")
   Call<User> perfomeRegistration(@Field("name") String Name,
                                  @Field("email") String Email,
                                  @Field("password") String Password,
                                  @Field("confirm_password") String Confirm_password,
                                  @Field("image") String Image,
                                  @Field("gender") String Gender,
                                  @Field("contact") String Contact,
                                  @Field("city_id") String City_id,
                                  @Field("user_type") String User_type,
                                  @Field("referral_code") String Referral_code,
                                  @Field("token") String Token);


    @FormUrlEncoded
    @POST("login")
    Call<loginModel> userlogin(@Field("contact") String Contact,
                               @Field("password") String Password,
                               @Field("token") String token,
                               @Field("device_id") String Device_id,
                               @Field("user_type") String User_type);

    @GET("users/count")
    Call<ResUserCount> getCounts(@Header("Authorization") String Authorization);


    @GET("driver-list/details")
    Call<Driverdetailsmodel> getDriverList(@Header("Authorization") String Authorization);


    // Passengers List
    @GET("passenger/list")
    Call<PassengerDetailsmodel> getPassengerList(@Header("Authorization") String Authorization);

    @GET("driver/details/{id}")
    Call<ResDriverDetails> getDriversDetails(@Header("Authorization") String Authorization, @Path("id") int userId);

    @GET("passenger/details/{id}")
    Call<ResPassengerDetails> getPassengerDetails(@Header("Authorization") String Authorization, @Path("id") int userId);

    @GET("vehicle-type/get")
    Call<CarTypeModel> getVehicleTypes();

    @FormUrlEncoded
    @POST("driver/filter")
    Call<Filterdriversmodel> getFilteredDriverList(@Header("Authorization") String Authorization
            , @Field("status") String status, @Field("vehicle_type") String vehicleType, @Field("car_category") String carCategory);

    @GET("driver/rides/{user_id}")
    Call<DriverHistoryModel> getRidesHistory(@Header("Authorization") String Authorization, @Path("user_id") Integer userId);

    @GET("rides/refund")
    Call<RefundModel> getRefundRides(@Header("Authorization") String Authorization);

    @GET("drivers/today/rides")
    Call<Todaysridemodel> gettodayride(@Header("Authorization") String Authorization);

 @FormUrlEncoded
 @POST("driver/today/payment")
 Call<Paymentmodel> getDriverFares(@Header("Authorization") String Authorization,@Field("user_id") int userId,@Field("end_date") String endDate);
}