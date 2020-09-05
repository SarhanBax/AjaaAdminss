package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import androidx.appcompat.widget.Toolbar;

import com.example.ajaaadmin.interfacess.DriverDetails_interface;
import com.example.ajaaadmin.models.Driverdetailsmodel;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.List;

public class DriversDetails extends AppCompatActivity implements DriverDetails_interface,SearchView.OnQueryTextListener
{
    RecyclerView recyclerView;
    Recycleradapter recycleradapter;
    List<Driverdetailsmodel.DriverDetails> driversDetails;
    APIService apiService=new APIService();
    Context context;
    private Toolbar toolbar;
    ProgressBar progressBar;
    ShimmerFrameLayout shimmerFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driversdetailsrecycle);
        context=DriversDetails.this;
        recyclerView=findViewById(R.id.driverdetailsrecyclers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        driversDetails=new ArrayList<>();
        getdriverdetails();
        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //toolbar.setNavigationIcon(R.drawable.ic_toolbar);
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        shimmerFrameLayout=findViewById(R.id.shimmerfordetails);
        showShimmer();
    }


    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
            MenuItem menuItem= menu.findItem(R.id.action_search);
            SearchView searchView=(SearchView) menuItem.getActionView();
            searchView.setOnQueryTextListener(this);
              return true;

    }

    private void getdriverdetails()
    {
        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");


        apiService.driverDetails_interface=this;
        apiService.getdetails(context,token);

    }

    @Override
    public void driverdetailsclass(Driverdetailsmodel driverdetailsmodel)
    {
        if (driverdetailsmodel.getStatus().equals("ok"))
        {
            hideShimmer();
        }
        listData(driverdetailsmodel.getDriver_details());
    }

    private void listData(List<Driverdetailsmodel.DriverDetails> drivers) {

        driversDetails=drivers;

        recycleradapter=new Recycleradapter(driversDetails,context);
        recyclerView.setAdapter(recycleradapter);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        String userInput=newText.toLowerCase();
        List<Driverdetailsmodel.DriverDetails> navlist=new ArrayList<>();
        for (Driverdetailsmodel.DriverDetails driver : driversDetails)
        {
            if (driver.getName().toLowerCase().contains(userInput)|| driver.getCityname().toLowerCase().contains(userInput))
            {
                navlist.add(driver);
            }
        }
        recycleradapter.updatelist(navlist);
        return true;
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
