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
import com.example.ajaaadmin.models.Driverdetailsmodel;
import com.example.ajaaadmin.models.PassengerDetailsmodel;

import java.util.List;

public class Recycleradapterpassenger extends RecyclerView.Adapter<Recycleradapterpassenger.PassengerViewholder>
{
    private List<PassengerDetailsmodel.DetailsPessenger.detailsofpassenger> detailsofpassengers;
    private Context context;



    public Recycleradapterpassenger(List<PassengerDetailsmodel.DetailsPessenger.detailsofpassenger> passengerlist, Context context)
    {
        this.detailsofpassengers = passengerlist;
        this.context = context;
    }


    @Override
    public Recycleradapterpassenger.PassengerViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_passenger_details,parent,false);

        return new PassengerViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycleradapterpassenger.PassengerViewholder holder, int position) {
        PassengerDetailsmodel.DetailsPessenger.detailsofpassenger passenger=detailsofpassengers.get(position);
        holder.passengername.setText(passenger.getName());
        holder.passengercontactno.setText(passenger.getContact());
        holder.passengerid.setText(passenger.getId());
        Glide.with(context).load(context.getString(R.string.image_url)+passenger.getImage()).into(holder.passengerimage);

    holder.linearLayoutpassenger.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context,SpecificPassengerActivity.class);
            intent.putExtra("id",passenger.getId());
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount()
    {
        return detailsofpassengers.size();
    }

    static class PassengerViewholder  extends RecyclerView.ViewHolder
    {
        TextView passengername,passengercontactno,passengerid;
        ImageView passengerimage;
        LinearLayout linearLayoutpassenger;

        PassengerViewholder(View itemView)
        {
            super(itemView);
            passengername=itemView.findViewById(R.id.passengername);
            passengercontactno=itemView.findViewById(R.id.passengercontactno);
            passengerid=itemView.findViewById(R.id.passengerid);

           passengerimage =itemView.findViewById(R.id.passengerpic);
            linearLayoutpassenger=itemView.findViewById(R.id.linearlayoutpassenger);
        }
    }
}
