package com.vincedelacerna123gmail.ezwheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView register;
    Button cancelRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        //this.register = this.findViewById(R.id.textView11);
        //this.cancelRegister = this.findViewById(R.id.button8);
        //this.cancelRegister.setOnClickListener(this);
       // this.register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        int id = v.getId();
//        switch (id){
//            case R.id.textView11:
//                startActivity(new Intent());
//                break;
//            case R.id.button8:
//                setContentView(R.layout.activity_main);
//        }
        setContentView(R.layout.registration_display);
    }
}
