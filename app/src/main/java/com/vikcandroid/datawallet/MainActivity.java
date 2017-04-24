package com.vikcandroid.datawallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(" USSD Short Codes");

        // Find the view that shows the safaricom category
        TextView saf = (TextView) findViewById(R.id.safaricom);

        // Set a click listener for the view
        assert saf != null;
        saf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SafaricomActivity.class));
            }
        });

        // Find airtel view
        final TextView airtel = (TextView) findViewById(R.id.airtel);

        // Set a click listener for the view
        airtel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), airtel.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Find orange view
        final TextView orange = (TextView) findViewById(R.id.orange);

        // Set a click listener for the view
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), orange.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Find dstv view
        final TextView dstv = (TextView) findViewById(R.id.dstv);

        // Set a click listener for the view
        dstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), dstv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Find yu mobile view
        final TextView yuMobile = (TextView) findViewById(R.id.yu);

        // Set a click listener for the view
        yuMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), yuMobile.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Find gotv view
        final TextView gotv = (TextView) findViewById(R.id.gotv);

        // Set a click listener for the view
        gotv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), gotv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
