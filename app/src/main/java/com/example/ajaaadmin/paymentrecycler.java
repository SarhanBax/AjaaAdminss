package com.example.ajaaadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaaadmin.models.Paymentmodel;

import java.util.List;

public class paymentrecycler extends RecyclerView.Adapter<paymentrecycler.viewholder>
{
    private List<Paymentmodel.Driver.Fares> payment;
    private Context context;

    public paymentrecycler(List<Paymentmodel.Driver.Fares> payment, Context context) {
        this.payment = payment;
        this.context = context;
    }

    @NonNull
    @Override
    public paymentrecycler.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutoftodayspayment,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull paymentrecycler.viewholder holder, int position) {

        Paymentmodel.Driver.Fares driver= payment.get(position);
        String rupess="₹ ";
        holder.id.setText(driver.getId());
        holder.source.setText(driver.getSource());
        holder.destination.setText(driver.getDestination());
        holder.farededucted.setText(rupess+driver.getFare_deducted());
        holder.fare.setText(rupess+driver.getFare());
        holder.payment.setText(rupess+driver.getPayment());
        holder.status.setText(driver.getStatus());
    }

    @Override
    public int getItemCount() {
        return payment.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder
    {
        TextView id,source,destination,farededucted,fare,payment,status;
        public viewholder(@NonNull View itemView)
        {
            super(itemView);

            id=itemView.findViewById(R.id.paymentid);
            source=itemView.findViewById(R.id.paymentsource);
            destination=itemView.findViewById(R.id.paymentdestination);
            farededucted=itemView.findViewById(R.id.paymentfarededucted);
            fare=itemView.findViewById(R.id.paymentfare);
            payment=itemView.findViewById(R.id.paymentpayment);
            status=itemView.findViewById(R.id.paymentstatus);
        }
    }
}
