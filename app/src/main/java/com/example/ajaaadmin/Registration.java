package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ajaaadmin.interfacess.RegistrationInterface;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Registration extends AppCompatActivity implements RegistrationInterface {
    EditText name,email,  password,confirm_Password,gender,contactno,city_id,user_type,
            referral_code,token;
    Bitmap bitmap;
    TextView selectpic;
    ImageView imageView;
    Context context;
    Button signup;
    APIService apiService=new APIService();
    private  static final int IMAGE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        context=Registration.this;
        name = findViewById(R.id.name);
        contactno = findViewById(R.id.contact_no);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.register);
        email=findViewById(R.id.email);
        confirm_Password=findViewById(R.id.confirm_password);
        gender=findViewById(R.id.gender);
        city_id=findViewById(R.id.city_id);
        user_type=findViewById(R.id.user_type);
        referral_code=findViewById(R.id.referral_code);
        token=findViewById(R.id.token);
        imageView=findViewById(R.id.picture);
       selectpic=findViewById(R.id.selectpic);
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               perfomeregistration();
           }
       });
       selectpic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               selectPic();
           }
       });

    }

    private void selectPic()
    {
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,IMAGE);
    }

    private String convertToString()
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,byteArrayOutputStream);
        byte[] imgByte = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(imgByte,Base64.DEFAULT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode== IMAGE && resultCode==RESULT_OK && data!=null)
        {
            Uri path = data.getData();

            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),path);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void perfomeregistration() {
        String username = name.getText().toString().trim();
        String phoneno = contactno.getText().toString().trim();
        String Password = password.getText().toString().trim();
        String Email=email.getText().toString().trim();
        String Confirm_password=confirm_Password.getText().toString().trim();
        String Gender=gender.getText().toString().trim();
        String City_id=city_id.getText().toString().trim();
        String User_type=user_type.toString().trim();
        String Referral_code=referral_code.getText().toString().trim();
        String Token=token.getText().toString().trim();
        String image=convertToString();




    }


    @Override
    public void registrationclass(User user)
    {
        if (user.getStatus().equals("ok"))
        {
            String msg=user.getMessage().getMessage();
            Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
        }
    }
    }
