package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
        private ImageView imageView;
        private TextView textView;
        private Button buttonTouristPlace, buttonExploreMore;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // Ensure the XML file is named activity_main.xml

            // Initialize Views
            imageView = findViewById(R.id.imageView);
            textView = findViewById(R.id.textView);
            buttonTouristPlace = findViewById(R.id.buttonTouristPlace);
            buttonExploreMore = findViewById(R.id.buttonExploreMore);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("");
                }
            });

            buttonTouristPlace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to TouristPlaceActivity
                    Intent intent = new Intent(MainActivity.this, PlaceActivity.class);
                    startActivity(intent);
                }
            });

            // Set OnClickListener for buttonExploreMore
            buttonExploreMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Action for Explore More Button
                    Toast.makeText(MainActivity.this, "Explore More Clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
