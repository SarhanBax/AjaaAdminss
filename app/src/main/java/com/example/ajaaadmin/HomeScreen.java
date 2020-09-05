package com.example.ajaaadmin;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ajaaadmin.interfacess.CarType_Interface;
import com.example.ajaaadmin.interfacess.Count_interface;
import com.example.ajaaadmin.models.CarTypeModel;
import com.example.ajaaadmin.models.PassengerDetailsmodel;
import com.example.ajaaadmin.models.ResUserCount;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends Fragment implements Count_interface,CarType_Interface
{
    public HomeScreen()
    {

    }


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private LinearLayout linearLayout;
    private TextView profile;
    private TextView Total_user;
    private TextView Rejected_driver;
    private TextView Total_driver;
    private TextView Approved_driver;
    private TextView Pending_driver;
    private TextView vehicletypename;
    private ImageView vehicletypeimage;
    private TextView Passenger;
    private TextView Rides_completed;
    private RecyclerView recyclerViews;
    private RecyclerforVehicletype recyclerforVehicletype;
    private List<CarTypeModel.VehicleType> vehicletype;
    private TextView Rides_canceled;
    private TextView Rides_pending;
    private TextView Rides_booked;
    private TextView Car;
    private TextView Rickshaw;
    private TextView Bike,refund;
    private LinearLayout DRiverdetails,passenger,test,TesT;
   private TextView seden ;
    private Context context;
    private APIService apiService=new APIService();

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.activity_home_screen,
                container,false);
        context=getActivity();
        mSwipeRefreshLayout = view.findViewById(R.id.swipeToRefresh);
        linearLayout = view.findViewById(R.id.linear_layout);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorAccent);
        Total_user=view.findViewById(R.id.total_users);
        Rejected_driver=view.findViewById(R.id.rejected_drivers);
        Approved_driver=view.findViewById(R.id.approved_drivers);
        Total_driver=view.findViewById(R.id.total_drivers);
        TesT =view.findViewById(R.id.Test);
        Pending_driver=view.findViewById(R.id.pending_request);
        Passenger=view.findViewById(R.id.total_passengers);
        Rides_completed=view.findViewById(R.id.rides_completed);
        Rides_canceled=view.findViewById(R.id.rides_cancelled);
        vehicletypeimage=view.findViewById(R.id.vehicletypeimage);
        vehicletypename=view.findViewById(R.id.vehicletypename);
        test=view.findViewById(R.id.test);
        refund=view.findViewById(R.id.refund);
        refund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RefundActivity.class);
                startActivity(intent);
            }
        });
        Rides_pending=view.findViewById(R.id.rides_pending);
        Rides_booked=view.findViewById(R.id.rides_booked);
        Car=view.findViewById(R.id.car);
        recyclerViews=view.findViewById(R.id.listviewforvehicletype);
        recyclerViews.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,true));
        vehicletype=new ArrayList<>();
        passenger=view.findViewById(R.id.PASSENGER);
        passenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity().getApplicationContext(),PassengerDetails.class);
                startActivity(intent);
            }
        });
        Rickshaw=view.findViewById(R.id.autorickshaw);
        Bike=view.findViewById(R.id.bike);

        DRiverdetails=view.findViewById(R.id.DRIVERDETAILS);
        DRiverdetails.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity().getApplicationContext(),DriversDetails.class);
            startActivity(intent);
        });
       seden=view.findViewById(R.id.sedan);

        getcountdata();
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()
        {
            @Override
            public void onRefresh()
            {
                getcountdata();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

        return view;
    }

    private void getcountdata()
    {
        String token= "Bearer "+ UserPreference.readString(context, UserPreference.Token,"");
        apiService.count_interface=this;
        apiService.getcount(context,token);
        apiService.carType_interface=this;
        apiService.getVehicleType(context);


    }


    @Override
    public void count_class(ResUserCount resUserCount)
    {
        Total_user.setText(resUserCount.getCounts().getTotal_users());
        Rejected_driver.setText(resUserCount.getCounts().getRejected_driver());
        Approved_driver.setText(resUserCount.getCounts().getApproverd_driver());
        Total_driver.setText(resUserCount.getCounts().getDriver());
        Pending_driver.setText(resUserCount.getCounts().getPending_driver());
        Passenger.setText(resUserCount.getCounts().getPassenger());
        Rides_completed.setText(resUserCount.getCounts().getRides_completed());
        Rides_canceled.setText(resUserCount.getCounts().getRides_canceled());
        Rides_pending.setText(resUserCount.getCounts().getRides_pending());
        Rides_booked.setText(resUserCount.getCounts().getRides_booked());
        Car.setText(resUserCount.getCounts().getCar());
        Bike.setText(resUserCount.getCounts().getBikes());
        Rickshaw.setText(resUserCount.getCounts().getRickshaw());
        seden.setText(resUserCount.getCounts().getSedan());


    }


    @Override
    public void Cartypeclass(CarTypeModel carTypeModel)
    {
        Listdata(carTypeModel.getVehicle_types());
    }

    private void Listdata(List<CarTypeModel.VehicleType> vehicles)
    {
        vehicletype=vehicles;
        recyclerforVehicletype=new RecyclerforVehicletype(vehicletype,context);
        recyclerViews.setAdapter(recyclerforVehicletype);
    }
}


