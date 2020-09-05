package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ajaaadmin.interfacess.Interfacedriverdetails;
import com.example.ajaaadmin.models.ResDriverDetails;


public class Specificdriverdetail extends AppCompatActivity implements Interfacedriverdetails
{
    TextView name,email,contact_no,cityid,vehicle_no,vehicle_name,driver_star,
            description,bankholdername,bankname,acno,ifsccode;
    ImageView driverimage,vehicle_image,license_front,license_back,rc_front,rc_back;
    APIService apiService=new APIService();
    Context context;
    Intent intent;
    Button ridesdetails,paymentdetails;
    String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specificdriverdetail);
        name=findViewById(R.id.drivername);
        email=findViewById(R.id.driveremail);
        contact_no=findViewById(R.id.drivercontact);
        cityid=findViewById(R.id.drivercity);
        vehicle_no=findViewById(R.id.vehicleno);
        vehicle_name=findViewById(R.id.vehicle_name);
        driver_star=findViewById(R.id.driver_review);
        driverimage=findViewById(R.id.driverimage);
        context=Specificdriverdetail.this;
        vehicle_image=findViewById(R.id.vehicle_image);
        license_front=findViewById(R.id.licensefront);
        license_back=findViewById(R.id.licenseback);
        rc_front=findViewById(R.id.rcfront);
        rc_back=findViewById(R.id.rcback);
        ridesdetails=findViewById(R.id.ridesdetails);
        paymentdetails=findViewById(R.id.paymentdetails);

        description=findViewById(R.id.description);
        bankholdername=findViewById(R.id.driveracname);
        bankname=findViewById(R.id.driverbankname);
        acno=findViewById(R.id.acno);
        ifsccode=findViewById(R.id.driverifsc);
        intent=getIntent();
        uid=intent.getStringExtra("id");

        driver();
    }

    private void driver()
    {
        int id=Integer.parseInt(uid);
        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");
        apiService.interfacedriverdetails=this;
        apiService.getSpecificdriver(context,token,id);


    }


    @Override
    public void Interfacedriverdetailsinterface(ResDriverDetails resDriverDetails)
    {
        name.setText(resDriverDetails.getDriver_details().getName());
        email.setText(resDriverDetails.getDriver_details().getEmail());
        contact_no.setText(resDriverDetails.getDriver_details().getContact());
        cityid.setText(resDriverDetails.getDriver_details().getCity_id());
        vehicle_no.setText(resDriverDetails.getDriver_details().getVehicle_details().getVehicle_no());
        vehicle_name.setText(resDriverDetails.getDriver_details().getVehicle_details().getVehicle_name());
        description.setText(resDriverDetails.getDriver_details().getVehicle_details().getDescription());
        acno.setText(resDriverDetails.getDriver_details().getDriver_bank_details().getAc_no());
        bankholdername.setText(resDriverDetails.getDriver_details().getDriver_bank_details().getAc_holder_name());
        bankname.setText(resDriverDetails.getDriver_details().getDriver_bank_details().getBank_name());
        ifsccode.setText(resDriverDetails.getDriver_details().getDriver_bank_details().getIfsc());
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getImage()).into(driverimage);
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getVehicle_details().getFront_image()).into(vehicle_image);
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getVehicle_details().getFront_license()).into(license_front);
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getVehicle_details().getBack_license()).into(license_back);
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getVehicle_details().getFront_rc_book()).into(rc_front);
        Glide.with(context).load(context.getString(R.string.image_url)+resDriverDetails.getDriver_details().getVehicle_details().getBack_rc_book()).into(rc_back);

        ridesdetails.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Recyclerhistoryofdriver.class);
                intent.putExtra("id",resDriverDetails.getDriver_details().getId());
                context.startActivity(intent);
            }
        });
        paymentdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Todayspayment.class);
                intent.putExtra("id",resDriverDetails.getDriver_details().getId());
                context.startActivity(intent);
            }
        });



    }
}
