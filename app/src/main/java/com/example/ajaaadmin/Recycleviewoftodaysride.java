package com.example.ajaaadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaaadmin.models.Todaysridemodel;

import java.util.List;

public class Recycleviewoftodaysride extends RecyclerView.Adapter<Recycleviewoftodaysride.todaysViewholder>
{
    private List<Todaysridemodel.Today_ride> today_rides;
    private Context context;

    public Recycleviewoftodaysride(List<Todaysridemodel.Today_ride> today_rides, Context context)
    {
        this.today_rides = today_rides;
        this.context = context;
    }

    @NonNull
    @Override
    public Recycleviewoftodaysride.todaysViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutoftodaysride,parent,false);

        return new todaysViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycleviewoftodaysride.todaysViewholder holder, int position) {
    Todaysridemodel.Today_ride today_ride=today_rides.get(position);
    holder.drivername.setText(today_ride.getDriver_name());
    holder.drivercontactno.setText(today_ride.getDriver_contact());
    holder.bookeddate.setText(today_ride.getBook_date());
    holder.sourceaddress.setText(today_ride.getSource_address());
    holder.destinationaddress.setText(today_ride.getDestination_address());
    holder.fare.setText(today_ride.getFare());
    holder.distance.setText(today_ride.getDistance());
    holder.duration.setText(today_ride.getDuration());
    holder.ridestatus.setText(today_ride.getRide_status());
    holder.noofpassenger.setText(today_ride.getPassenger_count());
    holder.passengername.setText(today_ride.getPassenger_name());
    holder.passengercontact.setText(today_ride.getPassenger_contact());
    }

    @Override
    public int getItemCount()
    {
        return  today_rides == null ? 0 : today_rides.size();
    }

    public static class todaysViewholder extends RecyclerView.ViewHolder
    {
        TextView drivername,drivercontactno,bookeddate,sourceaddress,destinationaddress,fare,distance,
                duration,ridestatus,noofpassenger,passengername,passengercontact;

        public todaysViewholder(@NonNull View itemView)
        {
            super(itemView);
            drivername=itemView.findViewById(R.id.todaydrivername);
            drivercontactno=itemView.findViewById(R.id.todaydrivercontact);
            bookeddate=itemView.findViewById(R.id.todayridedate);
            sourceaddress=itemView.findViewById(R.id.todaysourceaddress);
            destinationaddress=itemView.findViewById(R.id.todaydestinationaddress);
            fare=itemView.findViewById(R.id.todayFare);
            distance=itemView.findViewById(R.id.todaydistanceofride);
            duration=itemView.findViewById(R.id.todayduration);
            ridestatus=itemView.findViewById(R.id.todayridestatus);
            noofpassenger=itemView.findViewById(R.id.todayNoofpassenger);
            passengername=itemView.findViewById(R.id.todaybookedpassengername);
            passengercontact=itemView.findViewById(R.id.todaybookedpassengercontact);

        }
    }
}
