package com.example.formretrofit;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.example.formretrofit.interfacess.LoginInterfaces;
import com.example.formretrofit.interfacess.RegistrationInterface;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIService
{
    public RegistrationInterface registrationInterface =null;
    public LoginInterfaces loginInterfaces=null;

    public void ScheduleRidePromoCodeDetails(Context context,String username,String phoneno,String password,String email,
                                             String confirm_password,String gender,String city_id, String usertype, String refferal_code, String token, String image){
        ProgressDialog pDialog = new ProgressDialog(context,R.style.AppTheme);
        pDialog.setMessage(context.getResources().getString(R.string.app_name));
        pDialog.show();
        RequestInterface service = getApiInstance(context);
        try{
            service.perfomeRegistration(username,email,password,confirm_password,image,gender,phoneno,city_id,usertype,refferal_code,token)
                    .enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call, Response<User> response) {
                            pDialog.dismiss();
                            if(response.isSuccessful()) {
                               User user= response.body();
                                try {
                                    registrationInterface.registrationclass(user);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        @Override
                        public void onFailure(Call<User> call, Throwable t) {
                            pDialog.dismiss();
                            String message="User has not registered";
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();

                        }
                    });
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Logindetails(Context context, String contact, String password, String token, String deviceID,String Usertype)
    {
        ProgressDialog pDialog = new ProgressDialog(context,R.style.AppTheme);
        pDialog.setMessage(context.getResources().getString(R.string.app_name));
        pDialog.show();
        RequestInterface service = getApiInstance(context);
        try{
            service.userlogin(contact,password,token,deviceID,Usertype)

                    .enqueue(new Callback<loginModel>() {
                        @Override
                        public void onResponse(Call<loginModel> call, Response<loginModel> response) {
                            pDialog.dismiss();
                            if(response.isSuccessful()) {
                                loginModel Loginmodel= response.body();
                                try {
                                    loginInterfaces.loginClass(Loginmodel);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        @Override
                        public void onFailure(Call<loginModel> call, Throwable t) {
                            pDialog.dismiss();
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();

                        }
                    });
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private RequestInterface getApiInstance(Context context)
    {
        HttpLoggingInterceptor logInter = new HttpLoggingInterceptor();
        logInter.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient mIntercepter = new OkHttpClient.Builder()
                .addInterceptor(logInter)
                .build();
        //String BASE_URL = "https://drive.ajaa.co.in/api/auth/";
        String BASE_URL = "https://demo.ajaa.co.in/api/auth/";
        //String BASE_URL = "http://192.168.0.14:80/api/auth/";
        Retrofit retrofitInstance = new Retrofit.Builder()
                //.addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(mIntercepter)
                .build();
        return retrofitInstance.create(RequestInterface.class);
    }




}
