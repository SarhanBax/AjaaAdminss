package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.ajaaadmin.interfacess.DriverFilterinterface;
import com.example.ajaaadmin.models.Filterdriversmodel;

public class Notapproved extends AppCompatActivity implements DriverFilterinterface
{
    Context context;
    APIService apiService=new APIService();
    Intent intent;
    String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notapproved);

        intent=getIntent();
        uid=intent.getStringExtra("id");
        rides();

    }

    public void rides()
    {

    }
    @Override
    public void getdriverfilter(Filterdriversmodel filterdriversmodel)
    {
        filterdriversmodel.setStatus("reject");
    }
}