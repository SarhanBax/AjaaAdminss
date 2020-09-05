package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

import com.example.ajaaadmin.interfacess.HistoryofdriverInterface;
import com.example.ajaaadmin.models.DriverHistoryModel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class Recyclerhistoryofdriver extends AppCompatActivity implements HistoryofdriverInterface
{
    RecyclerView recyclerView;
    Recyclerofhistorydriver recyclerhistoryofdriver;
    List<DriverHistoryModel.Driver_ride_history> driver_ride_histories;
    APIService apiService= new APIService();
    Context context;
    Intent intent;
    String uid;
    Toolbar toolbar;
    ShimmerFrameLayout shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerhistoryofdriver);
        context=Recyclerhistoryofdriver.this;
        recyclerView=findViewById(R.id.recyclerhistorydriver);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        driver_ride_histories=new ArrayList<>();
        intent=getIntent();
        uid=intent.getStringExtra("id");
        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Drawable drawable= ContextCompat.getDrawable(getApplicationContext(),R.drawable.ic_filter_list);
        toolbar.setOverflowIcon(drawable);
        shimmerFrameLayout=findViewById(R.id.shimmerforhistory);
        showShimmer();
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        historydriver();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ridesfilter, menu);
        return true;
    }


    private void historydriver()
    {

        int id = Integer.parseInt(uid);
        String token = "Bearer " + UserPreference.readString(context, UserPreference.Token, "");
        apiService.historyofdriverInterface=this;
        apiService.getdriverhistory(context,token,id);

    }

    @Override
    public void historydriverinterfaceclass(DriverHistoryModel driverHistoryModel)
    {
        if (driverHistoryModel.getStatus().equals("ok"))
        {
            hideShimmer();
        }
    ListData(driverHistoryModel.getDriver_ride_history());
    }
    private void ListData(List<DriverHistoryModel.Driver_ride_history> history)
    {
        driver_ride_histories=history;
        recyclerhistoryofdriver=new Recyclerofhistorydriver(history,context);
        recyclerView.setAdapter(recyclerhistoryofdriver);

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
