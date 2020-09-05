package com.example.ajaaadmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class nav extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener

{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_layout);
        loadfragment(new HomeScreen());
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    @Override
    public void onBackPressed()
    {
        BottomNavigationView mBottomNavigationView = findViewById(R.id.navigation_view);
        if (mBottomNavigationView.getSelectedItemId() == R.id.HOME)
        {
            super.onBackPressed();
            finish();
        }
        else
        {
            mBottomNavigationView.setSelectedItemId(R.id.HOME);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;
        switch (item.getItemId())
        {
            case R.id.HOME:
                fragment=new HomeScreen();
                break;
            case R.id.Driver:
                fragment=new Todaysride();
                break;
        }


        return loadfragment(fragment);
    }

    private boolean loadfragment(Fragment fragment)
    {
        if (fragment!=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
