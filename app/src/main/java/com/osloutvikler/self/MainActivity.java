package com.osloutvikler.self;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetStarted=findViewById(R.id.button_start);

        buttonGetStarted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //We go to login a

            }
        });
        }
    }
