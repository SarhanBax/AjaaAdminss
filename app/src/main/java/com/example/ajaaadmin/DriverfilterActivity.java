package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import  androidx.appcompat.widget.Toolbar;

import com.example.ajaaadmin.interfacess.DriverFilterinterface;
import com.example.ajaaadmin.models.Filterdriversmodel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class DriverfilterActivity extends AppCompatActivity implements DriverFilterinterface  {
    RecyclerView recyclerView;
    DriverfilterRecyclerView driverfilterRecyclerView;
    List<Filterdriversmodel.Filter> Filter;
    APIService apiService=new APIService();
    Context context;
    Intent intent;
    String uid;
    Spinner spinner;
    Toolbar toolbar;
    ShimmerFrameLayout shimmerFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverfilter);
        context=DriverfilterActivity.this;
        recyclerView=findViewById(R.id.filterdriverdetailsrecyclers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Filter=new ArrayList<>();
        toolbar=findViewById(R.id.toolBar);
        shimmerFrameLayout=findViewById(R.id.shimmerfilter);
        showShimmer();

        intent=getIntent();
        uid=intent.getStringExtra("id");
        assert uid != null;
        int id = Integer.parseInt(uid);
        if (id == 1) {
            setSupportActionBar(toolbar);

            getSupportActionBar().setDisplayShowTitleEnabled(false);
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),
                    R.drawable.ic_filter_list);
            toolbar.setOverflowIcon(drawable);
            toolbar.setNavigationOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    finish();
                }
            });
        }


            getdriverfilter();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.carcategory, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.Sedan)
        {
            String status = "approved";
            String vehicletype = "car";
            String cartype = "Sedan";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);
        }  if(id == R.id.Economy)
        {
            String status = "approved";
            String vehicletype = "car";
            String cartype = "Economy";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);

        }  if(id == R.id.Xl)
        {
            String status = "approved";
            String vehicletype = "car";
            String cartype = "xl";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);
        } if (id==R.id.hatchback)
        {
            String status = "approved";
            String vehicletype = "car";
            String cartype = "hatchback";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);
        }

        return super.onOptionsItemSelected(item);
    }

    private void getdriverfilter()
    {
        int id = Integer.parseInt(uid);
        if (id == 1) {
            String status = "approved";
            String vehicletype = "car";
            String cartype = "null";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);


        }  if (id == 2) {
            String status = "approved";
            String vehicletype = "rickshaw";
            String cartype = "null";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);

        }
        if (id==3)
        {
            String status = "approved";
            String vehicletype = "bike";
            String cartype = "null";
            String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
            apiService.driverFilterinterface = this;
            apiService.getfilterDriver(context, token, status, vehicletype, cartype);

        }
    }

    @Override
    public void getdriverfilter(Filterdriversmodel filterdriversmodel)
    {
        if (filterdriversmodel.getStatus().equals("ok")||filterdriversmodel.getStatus().equals("error"))
        {
            hideShimmer();
        }

        ListData(filterdriversmodel.getFilter());
    }

    private void ListData(List<Filterdriversmodel.Filter> filter)
    {

        Filter=filter;
        if (filter.isEmpty())
        {
            hideShimmer();
            Toast.makeText(context,"Drivers not found",Toast.LENGTH_SHORT).show();
        } else {


            driverfilterRecyclerView = new DriverfilterRecyclerView(Filter, context);
            recyclerView.setAdapter(driverfilterRecyclerView);
        }
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
