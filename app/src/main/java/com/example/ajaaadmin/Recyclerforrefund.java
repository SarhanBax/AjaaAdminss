package com.example.ajaaadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaaadmin.models.RefundModel;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.List;
import java.util.logging.Handler;

public class Recyclerforrefund extends RecyclerView.Adapter<Recyclerforrefund.viewholder>
{
    private List<RefundModel.Rides> refund;
    private Context context;
    boolean showShimmer =true;

    public Recyclerforrefund(List<RefundModel.Rides> refund, Context context) {
        this.refund = refund;
       this.context=context;
    }

    @Override
    public Recyclerforrefund.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.refundlayout,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerforrefund.viewholder holder, int position)
    {
                RefundModel.Rides rides = refund.get(position);
                holder.usertype.setText(rides.getUser_type());
                holder.source.setText(rides.getSource_address());
                holder.destination.setText(rides.getDestination_address());
                holder.cartype.setText(rides.getVehicle_cat_name());
                holder.fare.setText(rides.getFare());
                holder.bookedtime.setText(rides.getBook_time());
                holder.bookeddate.setText(rides.getBook_date());
                holder.ridestatus.setText(rides.getRide_status());
                holder.canceledby.setText(rides.getCanceled_by());

    }

    @Override
    public int getItemCount()
    {
        return refund.size();
    }

    public class viewholder extends RecyclerView.ViewHolder
    {
        TextView usertype,source,destination,cartype,fare,bookedtime,bookeddate,ridestatus,canceledby;
        ShimmerFrameLayout shimmerFrameLayout;
        public viewholder(@NonNull View itemView)
        {
            super(itemView);

            usertype=itemView.findViewById(R.id.refundusertype);
            source=itemView.findViewById(R.id.refundsourceaddress);
            destination=itemView.findViewById(R.id.refunddestination);
            cartype= itemView.findViewById(R.id.refundcartype);
            fare=itemView.findViewById(R.id.refundfare);
            bookeddate=itemView.findViewById(R.id.refundbookdate);
            bookedtime=itemView.findViewById(R.id.refundbooktime);
            ridestatus=itemView.findViewById(R.id.refundridestatus);
            canceledby=itemView.findViewById(R.id.refundcanceledby);
        }
    }
}
