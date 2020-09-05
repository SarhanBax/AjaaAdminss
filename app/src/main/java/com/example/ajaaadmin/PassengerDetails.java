package com.example.ajaaadmin;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaaadmin.interfacess.DriverDetails_interface;
import com.example.ajaaadmin.interfacess.Passenger_interface;
import com.example.ajaaadmin.models.Driverdetailsmodel;
import com.example.ajaaadmin.models.PassengerDetailsmodel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class PassengerDetails extends AppCompatActivity implements Passenger_interface
{
    RecyclerView recyclerView;
    Recycleradapterpassenger recycleradapterpassenger;
    List<PassengerDetailsmodel.DetailsPessenger.detailsofpassenger> passengerDetails;
    APIService apiService=new APIService();
    Context context;
    ShimmerFrameLayout shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passengerdetailsrecycle);
        context= PassengerDetails.this;
        recyclerView=findViewById(R.id.passengerdetailsrecyclers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        passengerDetails=new ArrayList<>();
        shimmerFrameLayout=findViewById(R.id.shimmerforpassenger);
        showShimmer();
       getpassengerdetails();


    }

    private void getpassengerdetails()
    {
        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");

        apiService.passenger_interface=this;
        apiService.getdetailspassenger(context,token);

    }


    @Override
    public void passengerclass(PassengerDetailsmodel passengerDetailsmodel)
    {
        if (passengerDetailsmodel.getStatus().equals("ok"))
        {
            hideShimmer();
        }
        listData(passengerDetailsmodel.getPassengers().passenger);

    }


    private void listData(List<PassengerDetailsmodel.DetailsPessenger.detailsofpassenger> passengers) {
        passengerDetails=passengers;

        recycleradapterpassenger=new Recycleradapterpassenger(passengerDetails,context);
        recyclerView.setAdapter(recycleradapterpassenger);
    }

    private void hideShimmer()
    {
        shimmerFrameLayout.stopShimmer();
        shimmerFrameLayout.setVisibility(View.GONE);
    }
    private void showShimmer()
    {
        shimmerFrameLayout.startShimmer();
        shimmerFrameLayout.setVisibility(View.VISIBLE);
    }
}
