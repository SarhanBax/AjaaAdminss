package com.example.ajaaadmin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ajaaadmin.interfacess.DriverDetails_interface;
import com.example.ajaaadmin.models.Driverdetailsmodel;

import java.util.ArrayList;
import java.util.List;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.DriverViewholder>
{
    private List<Driverdetailsmodel.DriverDetails> driversDetails;
    private Context context;



    public Recycleradapter(List<Driverdetailsmodel.DriverDetails> driverlist, Context context)
    {
        this.driversDetails = driverlist;
        this.context = context;
    }


    @Override
    public Recycleradapter.DriverViewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_drivers_details,parent,false);

        return new DriverViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycleradapter.DriverViewholder holder, int position) {
        Driverdetailsmodel.DriverDetails driver=driversDetails.get(position);
        holder.drivername.setText(driver.getName());
        holder.drivercontactno.setText(driver.getContact());
        holder.drivervehicletype.setText(driver.getVehicle_name());
        holder.drivercarname.setText(driver.getCar_cat_name());
        holder.driverid.setText(driver.getId());
        holder.drivercity.setText(driver.getCityname());
        String a="pending";
        String userStatus=driver.getUser_status();
        if (userStatus.equals("approved"))
        {
            holder.driverstatus.setChecked(true);

        }else
        {
            holder.driverstatus.setChecked(false);
            holder.driverstatus.setText(a);
        }


        Glide.with(context).load(context.getString(R.string.image_url)+driver.getImage()).into(holder.driverimage);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Specificdriverdetail.class);
                intent.putExtra("id",driver.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return driversDetails.size();
    }

    static class DriverViewholder  extends RecyclerView.ViewHolder
    {
        TextView driverid,drivername,drivercontactno,drivervehicletype,drivercarname,drivercity;
        ImageView driverimage;
        Switch driverstatus;
        LinearLayout linearLayout;
        DriverViewholder(View itemView)
        {
            super(itemView);
            drivername=itemView.findViewById(R.id.drivername);
            drivercontactno=itemView.findViewById(R.id.drivercontactno);
            driverstatus=itemView.findViewById(R.id.driverstatus);
            drivervehicletype=itemView.findViewById(R.id.vehcletype);
            drivercarname=itemView.findViewById(R.id.carname);
            drivercity=itemView.findViewById(R.id.cityname);
            driverimage=itemView.findViewById(R.id.driverpic);
            driverid=itemView.findViewById(R.id.userid);
            linearLayout=itemView.findViewById(R.id.linearlayout);

        }

    }
    public void updatelist(List<Driverdetailsmodel.DriverDetails> rawlist)
    {
        driversDetails =new ArrayList<>();
        driversDetails.addAll(rawlist);
        notifyDataSetChanged();
    }

}
