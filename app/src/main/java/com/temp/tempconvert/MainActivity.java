package com.temp.tempconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Cel;
    private Button C, F;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cel = findViewById(R.id.C);
        C = findViewById(R.id.btn_c);
        F = findViewById(R.id.btn_f);
        res = findViewById(R.id.view);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double x = Integer.parseInt(Cel.getText().toString());

                double ans = (x * 9 / 5) + 32;

                res.setText(String.valueOf(ans));

            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y = Integer.parseInt(Cel.getText().toString());
                double ans1 = ((y - 32) * 5) / 9;

                res.setText(String.valueOf(ans1));

            }
        });


    }
}
