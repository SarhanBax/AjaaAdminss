package com.example.ajaaadmin;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.ajaaadmin.interfacess.Todaysdriveinterface;
import com.example.ajaaadmin.models.CarTypeModel;
import com.example.ajaaadmin.models.Driverdetailsmodel;
import com.example.ajaaadmin.models.ResUserCount;
import com.example.ajaaadmin.models.Todaysridemodel;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Todaysride extends Fragment implements Todaysdriveinterface
{
    public Todaysride()
    {

    }
    private Context context;
    private RecyclerView recyclerView;
    private APIService apiService=new APIService();
    private Recycleviewoftodaysride recycleviewoftodaysride;
    private List<Todaysridemodel.Today_ride> today_rides;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_todaysride,
                container, false);
        context =getActivity();
        recyclerView=view.findViewById(R.id.todaysride);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        today_rides=new ArrayList<>();
        gettodaysdrive();
        return view;
    }

   private void gettodaysdrive()
   {
       String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");
        apiService.todaysdriveinterface=this;
        apiService.gettodaysride(context,token);
   }



    @Override
    public void todaysdriveclass(Todaysridemodel todaysridemodel)
    {
       if (today_rides!=null && today_rides.isEmpty())
       {
           Toast.makeText(context,"There are no rides found today",Toast.LENGTH_SHORT).show();
       }
        Listdata(todaysridemodel.getToday_rides());
    }

    private void Listdata(List<Todaysridemodel.Today_ride> today_rideList)
    {
        today_rides =today_rideList;
        recycleviewoftodaysride=new Recycleviewoftodaysride(today_rides,context);
        recyclerView.setAdapter(recycleviewoftodaysride);
    }
}