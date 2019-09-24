package com.temp.tempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

        private Button btnconvert, btnaddition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        btnconvert = findViewById(R.id.btn_convert);
        btnaddition = findViewById(R.id.btn_sum);

        btnconvert.setOnClickListener(this);
        btnaddition.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn_convert){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.btn_sum){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
        }

    }
}
