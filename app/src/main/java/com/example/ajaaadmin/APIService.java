package com.example.ajaaadmin;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.example.ajaaadmin.interfacess.CarType_Interface;
import com.example.ajaaadmin.interfacess.Count_interface;
import com.example.ajaaadmin.interfacess.DriverDetails_interface;
import com.example.ajaaadmin.interfacess.DriverFilterinterface;
import com.example.ajaaadmin.interfacess.HistoryofdriverInterface;
import com.example.ajaaadmin.interfacess.Interfacedriverdetails;
import com.example.ajaaadmin.interfacess.LoginInterfaces;
import com.example.ajaaadmin.interfacess.Passenger_interface;
import com.example.ajaaadmin.interfacess.Paymentinterface;
import com.example.ajaaadmin.interfacess.RefundInterface;
import com.example.ajaaadmin.interfacess.SpecificPassengerinterface;
import com.example.ajaaadmin.interfacess.Todaysdriveinterface;
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
import com.facebook.shimmer.ShimmerFrameLayout;


import java.security.spec.ECField;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIService
{
  public LoginInterfaces loginInterfaces=null;
  public Count_interface count_interface=null;
  public DriverDetails_interface driverDetails_interface=null;
  public CarType_Interface carType_interface=null;
  public Passenger_interface passenger_interface=null;
  public Interfacedriverdetails interfacedriverdetails=null;
  public SpecificPassengerinterface specificPassengerinterface=null;
  public DriverFilterinterface driverFilterinterface=null;
  public HistoryofdriverInterface historyofdriverInterface=null;
  public RefundInterface refundInterface =null;
  public Todaysdriveinterface todaysdriveinterface=null;
  public Paymentinterface paymentinterface=null;
  public ShimmerFrameLayout shimmerFrameLayout;

  public void Logindetails(final Context context, String contact, String password, String token, String deviceID, String Usertype)
  {
      RequestInterface service=getApiInstance(context);
      try {
          service.userlogin(contact,password,token,deviceID,Usertype)
                  .enqueue(new Callback<loginModel>() {
                      @Override
                      public void onResponse(Call<loginModel> call, Response<loginModel> response) {
                          if (response.isSuccessful()){
                              Toast.makeText(context,"Login Successfull",Toast.LENGTH_LONG).show();
                              loginModel Loginmodel=response.body();
                              try {
                                  loginInterfaces.loginClass(Loginmodel);
                              } catch (Exception e) {
                                  e.printStackTrace();
                              }
                          }

                      }

                      @Override
                      public void onFailure(Call<loginModel> call, Throwable t) {
                        String message=t.getMessage();
                        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                      }
                  });
      }
      catch (Exception e){
          e.printStackTrace();
      }
  }
    public void getpayment(final Context context,String authorization,int user_id,String end_date)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getDriverFares(authorization,user_id,end_date)
                    .enqueue(new Callback<Paymentmodel>() {
                        @Override
                        public void onResponse(Call<Paymentmodel> call, Response<Paymentmodel> response) {
                            if (response.isSuccessful())
                            {
                                Paymentmodel paymentmodel=response.body();
                                try {
                                    paymentinterface.paymentinterfaceclass(paymentmodel);
                                }catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<Paymentmodel> call, Throwable t)
                        {
                            Toast.makeText(context,"no data found",Toast.LENGTH_SHORT).show();

                        }
                    });
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void gettodaysride(final Context context,String authorization)
    {
        RequestInterface service=getApiInstance(context);
        try
        {
            service.gettodayride(authorization)
                    .enqueue(new Callback<Todaysridemodel>() {
                        @Override
                        public void onResponse(Call<Todaysridemodel> call, Response<Todaysridemodel> response) {
                            if (response.isSuccessful())
                            {
                                Todaysridemodel todaysridemodel =response.body();
                                try {
                                    todaysdriveinterface.todaysdriveclass(todaysridemodel);

                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<Todaysridemodel> call, Throwable t)
                        {
                            String msg="No rides are booked todays";
                            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();

                        }
                    });
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void getrefund(final Context context,String authorization)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getRefundRides(authorization)
                    .enqueue(new Callback<RefundModel>() {
                        @Override
                        public void onResponse(Call<RefundModel> call, Response<RefundModel> response) {
                            if (response.isSuccessful())
                            {
                                RefundModel refundModel=response.body();
                                try {
                                    refundInterface.getrefundclass(refundModel);
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<RefundModel> call, Throwable t)
                        {
                            String msg="No refund today";
                            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
                        }
                    });
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void getdriverhistory(final Context context, String authorization,int userid)
    {
        RequestInterface service=getApiInstance(context);
        {
            try {
                service.getRidesHistory(authorization,userid)
                        .enqueue(new Callback<DriverHistoryModel>() {
                            @Override
                            public void onResponse(Call<DriverHistoryModel> call, Response<DriverHistoryModel> response) {
                                if (response.isSuccessful())
                                {
                                    DriverHistoryModel driverHistoryModel=response.body();
                                    try {
                                        historyofdriverInterface.historydriverinterfaceclass(driverHistoryModel);
                                    }catch (Exception e)
                                    {
                                        e.printStackTrace();
                                    }
                                }
                            }

                            @Override
                            public void onFailure(Call<DriverHistoryModel> call, Throwable t)
                            {
                                String msg="No data found";
                                Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
                            }
                        });
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public void getcount(final Context context, String authorization)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getCounts(authorization)
                    .enqueue(new Callback<ResUserCount>() {
                        @Override
                        public void onResponse(Call<ResUserCount> call, Response<ResUserCount> response) {
                            if (response.isSuccessful()){
                                ResUserCount resuser=response.body();
                                try {
                                   count_interface.count_class(resuser);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<ResUserCount> call, Throwable t) {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getfilterDriver(final Context context,String authorization,String status,String vehicletype,String car_category)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getFilteredDriverList(authorization,status,vehicletype,car_category)
            .enqueue(new Callback<Filterdriversmodel>() {
                @Override
                public void onResponse(Call<Filterdriversmodel> call, Response<Filterdriversmodel> response) {
                    if (response.isSuccessful())
                    {
                        Filterdriversmodel filterdriversmodel=response.body();
                      
                        try {
                            driverFilterinterface.getdriverfilter(filterdriversmodel);


                        } catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Filterdriversmodel> call, Throwable t) {

                    String message="No drivers found";
                    Toast.makeText(context,message,Toast.LENGTH_LONG).show();



                }
            });
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getdetailspassenger(final Context context, String authorization)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getPassengerList(authorization)
                    .enqueue(new Callback<PassengerDetailsmodel>() {
                        @Override
                        public void onResponse(Call<PassengerDetailsmodel> call, Response<PassengerDetailsmodel> response) {
                            if (response.isSuccessful()){
                                PassengerDetailsmodel passengerDetailsmodel=response.body();
                                try {
                                    passenger_interface.passengerclass(passengerDetailsmodel);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<PassengerDetailsmodel> call, Throwable t) {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getdetails(final Context context, String authorization)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getDriverList(authorization)
                    .enqueue(new Callback<Driverdetailsmodel>()
                    {
                        @Override
                        public void onResponse(Call<Driverdetailsmodel> call, Response<Driverdetailsmodel> response) {
                            if (response.isSuccessful())
                            {
                                Driverdetailsmodel driverdetailsmodel=response.body();
                                try
                                {
                                    driverDetails_interface.driverdetailsclass(driverdetailsmodel);
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<Driverdetailsmodel> call, Throwable t)
                        {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getVehicleType(final Context context)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getVehicleTypes()
                    .enqueue(new Callback<CarTypeModel>()
                    {
                        @Override
                        public void onResponse(Call<CarTypeModel> call, Response<CarTypeModel> response) {
                            if (response.isSuccessful())
                            {
                                CarTypeModel carTypeModel=response.body();
                                try
                                {
                                    carType_interface.Cartypeclass(carTypeModel);
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<CarTypeModel> call, Throwable t)
                        {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getSpecificdriver(final Context context, String authorization,int userid)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getDriversDetails(authorization,userid)
                    .enqueue(new Callback<ResDriverDetails>()
                    {
                        @Override
                        public void onResponse(Call<ResDriverDetails> call, Response<ResDriverDetails> response) {
                            if (response.isSuccessful())
                            {
                                ResDriverDetails resDriverDetails=response.body();
                                try
                                {
                                    interfacedriverdetails.Interfacedriverdetailsinterface(resDriverDetails);
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<ResDriverDetails> call, Throwable t)
                        {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getSpecificpassenger(final Context context, String authorization,int userid)
    {
        RequestInterface service=getApiInstance(context);
        try {
            service.getPassengerDetails(authorization,userid)
                    .enqueue(new Callback<ResPassengerDetails>()
                    {
                        @Override
                        public void onResponse(Call<ResPassengerDetails> call, Response<ResPassengerDetails> response) {
                            if (response.isSuccessful())
                            {
                                ResPassengerDetails resPassengerDetails=response.body();
                                try
                                {
                                    specificPassengerinterface.Specificpassengerclass(resPassengerDetails);
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<ResPassengerDetails> call, Throwable t)
                        {
                            String message=t.getMessage();
                            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
                        }
                    });
        }
        catch (Exception e){
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
    String BASE_URL = "https://demo.ajaa.co.in/api/auth/";
    Retrofit retrofitInstance = new Retrofit.Builder()
            //.addConverterFactory(new NullOnEmptyConverterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(mIntercepter)
            .build();


    return retrofitInstance.create(RequestInterface.class);
}


}
