package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ajaaadmin.interfacess.SpecificPassengerinterface;
import com.example.ajaaadmin.models.ResPassengerDetails;

public class SpecificPassengerActivity extends AppCompatActivity implements SpecificPassengerinterface {
    TextView id,name,email,gender,contact,city_id,referral_code;
    Context context;
    APIService apiService=new APIService();
    ImageView image;
    String ui;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_passenger);
        id=findViewById(R.id.id);
        name=findViewById(R.id.passengername);
        email=findViewById(R.id.passengeremail);
        gender=findViewById(R.id.passengergender);
        contact=findViewById(R.id.passengercontact);
        city_id=findViewById(R.id.passengercity);
        intent=getIntent();
        ui=intent.getStringExtra("id");
        context=SpecificPassengerActivity.this;
        referral_code=findViewById(R.id.Passengerefferalcode);
        image=findViewById(R.id.passengerimage);
        passenger();
    }

    private void passenger()
    {
        int id=Integer.parseInt(ui);
        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");
        apiService.specificPassengerinterface=this;
        apiService.getSpecificpassenger(context,token,id);

    }

    @Override
    public void Specificpassengerclass(ResPassengerDetails resPassengerDetails) {
        name.setText(resPassengerDetails.getPassenger_details().getName());
        id.setText(resPassengerDetails.getPassenger_details().getId());
        referral_code.setText(resPassengerDetails.getPassenger_details().getReferral_code());
        contact.setText(resPassengerDetails.getPassenger_details().getContact());
        email.setText(resPassengerDetails.getPassenger_details().getEmail());
        gender.setText(resPassengerDetails.getPassenger_details().getGender());
        city_id.setText(resPassengerDetails.getPassenger_details().getCity_id());
        Glide.with(context).load(context.getString(R.string.image_url)+resPassengerDetails.getPassenger_details().getImage()).into(image);

    }
}
