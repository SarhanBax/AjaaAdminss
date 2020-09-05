package com.example.ajaaadmin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ajaaadmin.models.CarTypeModel;
import com.example.ajaaadmin.models.Driverdetailsmodel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerforVehicletype extends RecyclerView.Adapter<RecyclerforVehicletype.VehicleViewHolder>
{
    private List<CarTypeModel.VehicleType> carTypesModel;
    private Context context;

    public RecyclerforVehicletype(List<CarTypeModel.VehicleType> carTypesModel, Context context) {
        this.carTypesModel = carTypesModel;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerforVehicletype.VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutforvehicletype,parent,false);

        return new VehicleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerforVehicletype.VehicleViewHolder holder, int position) {
        CarTypeModel.VehicleType vehicle=carTypesModel.get(position);
        holder.vehiclename.setText(vehicle.getVehicle_name());
        Glide.with(context).load(context.getString(R.string.vehicle_image_url)+vehicle.getImage()).into(holder.vehicleImage);
        holder.linearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context,DriverfilterActivity.class);
                intent.putExtra("id",vehicle.getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return carTypesModel.size();
    }

    static class VehicleViewHolder extends RecyclerView.ViewHolder
    {
        TextView vehiclename;
        ImageView vehicleImage;
        LinearLayout linearLayout;
        public VehicleViewHolder(@NonNull View itemView)
        {
            super(itemView);
            vehicleImage=itemView.findViewById(R.id.vehicletypeimage);
            vehiclename=itemView.findViewById(R.id.vehicletypename);
            linearLayout=itemView.findViewById(R.id.linear_layoutforvehicletype);
        }
    }
    public void updatelists(List<CarTypeModel.VehicleType> rawlists)
    {
        carTypesModel =new ArrayList<>();
        carTypesModel.addAll(rawlists);
        notifyDataSetChanged();
    }
}
