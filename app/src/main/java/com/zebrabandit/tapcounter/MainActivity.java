package com.zebrabandit.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double counter = 0.0, gap = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final Button oneTap = (Button) findViewById(R.id.oneTap);
        final Button minusTap = (Button) findViewById(R.id.minusTap);
        final Button plusTap = (Button) findViewById(R.id.plusTap);
        final EditText numberGap = (EditText) findViewById(R.id.numberGap);
        final TextView counterText = (TextView) findViewById(R.id.counterText);

        oneTap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                setContentView(R.layout.one_tap_layout);
            }
        });

        minusTap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gap = Double.parseDouble(numberGap.getText().toString());
                counter -= gap;
                counterText.setText(String.valueOf(counter));
            }
        });

        plusTap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gap = Double.parseDouble(numberGap.getText().toString());
                counter += gap;
                counterText.setText(String.valueOf(counter));
            }
        });

    }


}
