package com.example.formretrofit;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

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


}
