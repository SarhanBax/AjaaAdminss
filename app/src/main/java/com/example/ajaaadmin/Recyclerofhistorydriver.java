package com.example.ajaaadmin;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ajaaadmin.models.DriverHistoryModel;

import java.util.List;

public class Recyclerofhistorydriver extends RecyclerView.Adapter<Recyclerofhistorydriver.HistorydriverViewHolder>
{
    private List<DriverHistoryModel.Driver_ride_history> driver_ride_histories;
    private Context context;

    public Recyclerofhistorydriver(List<DriverHistoryModel.Driver_ride_history> driver_ride_histories, Context context)
    {
        this.driver_ride_histories = driver_ride_histories;
        this.context = context;
    }

    @Override
    public Recyclerofhistorydriver.HistorydriverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.historydriverlayout,parent,false);
        return new HistorydriverViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerofhistorydriver.HistorydriverViewHolder holder, int position) {
    DriverHistoryModel.Driver_ride_history history=driver_ride_histories.get(position);
    holder.name.setText(history.getUser().getName());
    holder.phonno.setText(history.getUser().getContact());
    holder.date.setText(history.getBook_date());
    holder.sourceaddress.setText(history.getSource_address());
    holder.destinationaddress.setText(history.getDestination_address());
    holder.ridemode.setText(history.getRide_mode());
    holder.fare.setText(history.getFare());

    String measure=" KM";
    String dis=history.getDistance();
    double i=Double.parseDouble(dis);
    holder.distance.setText(i+measure);
    holder.noofpassenger.setText(history.getPassenger_count());
    holder.duration.setText(history.getDuration());
    holder.ridestatus.setText(history.getRide_status());
        Glide.with(context).load(context.getString(R.string.image_url)+history.getUser().getImage()).into(holder.image);
    }

    @Override
    public int getItemCount()
    {
        return driver_ride_histories.size();
    }

    static class HistorydriverViewHolder extends RecyclerView.ViewHolder

    {
        TextView name,phonno,date,sourceaddress,destinationaddress,ridemode,fare,distance,duration,ridestatus,noofpassenger;
        ImageView image;
        public HistorydriverViewHolder(@NonNull View itemView)
        {
            super(itemView);
            name=itemView.findViewById(R.id.bookedpassengername);
            phonno=itemView.findViewById(R.id.bookedpassengercontact);
            image=itemView.findViewById(R.id.imageofpassengerbooked);
            date=itemView.findViewById(R.id.ridedate);
            sourceaddress=itemView.findViewById(R.id.sourceaddress);
            destinationaddress=itemView.findViewById(R.id.destinationaddress);
            noofpassenger=itemView.findViewById(R.id.Noofpassenger);
            ridemode=itemView.findViewById(R.id.Ridemode);
            fare=itemView.findViewById(R.id.Fare);
            distance=itemView.findViewById(R.id.distanceofride);
            duration=itemView.findViewById(R.id.duration);
            ridestatus=itemView.findViewById(R.id.ridestatus);

        }
    }

}
