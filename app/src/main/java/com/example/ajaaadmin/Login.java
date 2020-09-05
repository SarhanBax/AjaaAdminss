package com.example.ajaaadmin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ajaaadmin.interfacess.LoginInterfaces;

public class Login extends AppCompatActivity implements LoginInterfaces {
    Button Login;
    TextView register;
    Context context;
    EditText contact,password;
    APIService apiService=new APIService();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        context=Login.this;
        contact=findViewById(R.id.Contact);
        Login =findViewById(R.id.btnLogin);
        password=findViewById(R.id.inputPassword);


        if (!new UserPreference(context).isUserLogedOut())
        {
            starthomeactivity();
        }

       Login.setOnClickListener(v -> Perfomeloginuser());

    }
    private  void Perfomeloginuser()
    {
        String contactno=contact.getText().toString().trim();
        String passwordno=password.getText().toString().trim();
        String tokenno="222";
        String Device_id="222";
        String User_type="admin";
        apiService.loginInterfaces=this;
        apiService.Logindetails(context,contactno,passwordno,tokenno,Device_id,User_type);
        savelogindetails(contactno,passwordno);
    }


    @Override
    public void loginClass(loginModel Loginmodel)
    {
        if (Loginmodel.getStatus().equals("ok"))
        {

            String tok=Loginmodel.getMessage().getToken();
            Log.e("tag",tok);
            UserPreference.writeString(context, UserPreference.Token,tok);
            String msg=Loginmodel.getMessage().getMessage();
            Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Login.this,nav.class);
            startActivity(intent);



        }
        else
        {
            Toast.makeText(context, "login failed", Toast.LENGTH_SHORT).show();
        }


    }
    private void starthomeactivity()
    {
        Intent intent=new Intent(this,nav.class);
        startActivity(intent);
        finish();
    }
    private void savelogindetails(String contact,String password)
    {
        new UserPreference(context).saveLoginDetails(contact,password);
    }


}

