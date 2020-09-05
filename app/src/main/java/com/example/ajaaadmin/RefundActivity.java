package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import com.example.ajaaadmin.interfacess.RefundInterface;
import com.example.ajaaadmin.models.RefundModel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class RefundActivity extends AppCompatActivity implements RefundInterface
{
    Context context;
    APIService apiService=new APIService();
    RecyclerView recyclerView;
    Recyclerforrefund recyclerforrefund;
    List<RefundModel.Rides> refundModels;
    ProgressBar progressBar;
    ShimmerFrameLayout shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund);
        context = RefundActivity.this;
        recyclerView = findViewById(R.id.refundrecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        refundModels = new ArrayList<>();

        shimmerFrameLayout=findViewById(R.id.shimmer_view_container);
        showShimmer();
        refund();


    }


    private void refund()
    {

        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");
        apiService.refundInterface=this;
        apiService.getrefund(context,token);
    }

    @Override
    public void getrefundclass(RefundModel refundModel)
    {
      if (refundModel.getStatus().equals("ok"))
      {
          hideShimmer();

      }
        ListData(refundModel.getRides());

    }

    private void ListData(List<RefundModel.Rides> rides)
    {
        refundModels=rides;
        recyclerforrefund=new Recyclerforrefund(refundModels,context);
        recyclerView.setAdapter(recyclerforrefund);
    }
    private void hideShimmer()
    {
        shimmerFrameLayout.stopShimmer();
        shimmerFrameLayout.setVisibility(View.GONE);
    }
    private void showShimmer()
    {
        shimmerFrameLayout.startShimmer();
        shimmerFrameLayout.setVisibility(View.VISIBLE);
    }
}