package com.example.bt3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = (Button) findViewById(R.id.btnGetTime);
        final AlertDialog ad= new AlertDialog.Builder(this).create();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date= new Date();
                //String df =  DateFormat.getDateInstance(DateFormat.SHORT).format(date);
                String df=formatter.format(date);
                String message= "Thoi gian hien hanh bugs "+df;
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}