package com.itrainasia.myweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent toForecastIntent = new Intent(StartActivity.this, MainActivity.class);
                        startActivity(toForecastIntent);
                    }
                }
        );
    }

}
