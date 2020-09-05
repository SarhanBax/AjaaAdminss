package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ajaaadmin.interfacess.Paymentinterface;
import com.example.ajaaadmin.interfacess.Todaysdriveinterface;
import com.example.ajaaadmin.models.Paymentmodel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class Todayspayment extends AppCompatActivity implements Paymentinterface
{
    RecyclerView recyclerView;
    paymentrecycler paymentrecyclers;
    List<Paymentmodel.Driver.Fares> drivers;
    Context context;
    APIService apiService=new APIService();
    Intent intent;
    String uid;
    ShimmerFrameLayout shimmerFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todayspayment);
        recyclerView=findViewById(R.id.recycleviewforpayment);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        intent=getIntent();
        uid=intent.getStringExtra("id");
       drivers =new ArrayList<>();
       context=Todayspayment.this;
       shimmerFrameLayout=findViewById(R.id.shimmerforpayment);
       showShimmer();
       getpayment();

    }

    public void getpayment()
    {
        int id = Integer.parseInt(uid);
        String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
        String date="2020-08-19";
        apiService.paymentinterface=this;
        apiService.getpayment(context,token,id,date);
    }
    @Override
    public void paymentinterfaceclass(Paymentmodel paymentmodel)
    {
        if (paymentmodel.getStatus().equals("ok"))
        {
            hideShimmer();
        }
        ListData(paymentmodel.getDriver().getFares());
    }

    public void ListData(List<Paymentmodel.Driver.Fares> driverpayment)
    {
        drivers=driverpayment;
        paymentrecyclers=new paymentrecycler(drivers,context);
        recyclerView.setAdapter(paymentrecyclers);
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