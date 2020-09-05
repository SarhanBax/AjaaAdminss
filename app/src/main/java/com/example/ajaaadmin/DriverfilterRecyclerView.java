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
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.ajaaadmin.models.Filterdriversmodel;


import java.util.List;

public class DriverfilterRecyclerView extends RecyclerView.Adapter<DriverfilterRecyclerView.FilterViewHolder>
{
    private List<Filterdriversmodel.Filter> filters;
    private Context context;


    public DriverfilterRecyclerView(List<Filterdriversmodel.Filter> filters, Context context)
    {
        this.filters = filters;
        this.context = context;
    }

    @Override
    public DriverfilterRecyclerView.FilterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.filterdrivers,parent,false);
        return new FilterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DriverfilterRecyclerView.FilterViewHolder holder, int position)
    {
        Filterdriversmodel.Filter filter=filters.get(position);
        holder.drivername.setText(filter.getUsername());
        holder.contact.setText(filter.getContact());
        holder.vehicle_name.setText(filter.getVehicle_name());
        holder.userstatus.setText(filter.getUser_status());

        holder.carcategory.setText(filter.getCar_category());
        Glide.with(context).load(context.getString(R.string.image_url)+filter.getImage()).into(holder.image);

    }

    @Override
    public int getItemCount()
    {
        return filters.size();
    }

    static class FilterViewHolder extends RecyclerView.ViewHolder
    {
        TextView drivername,contact,vehicle_name,carcategory,userstatus;
        SwitchCompat switche;
        ImageView image;
        LinearLayout linearLayout;
        public FilterViewHolder(@NonNull View itemView)
        {
            super(itemView);
            drivername=itemView.findViewById(R.id.filterdrivername);
            contact=itemView.findViewById(R.id.filterdrivercontact);
            vehicle_name=itemView.findViewById(R.id.filterdrivervehicletype);
            image=itemView.findViewById(R.id.filterdriverimage);
            userstatus=itemView.findViewById(R.id.approvel);
            carcategory=itemView.findViewById(R.id.filterdrivercarcategory);
            linearLayout=itemView.findViewById(R.id.linearlayoutfilter);
        }
    }
}


