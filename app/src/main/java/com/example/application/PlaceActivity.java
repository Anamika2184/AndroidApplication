package com.example.application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlaceActivity extends AppCompatActivity {

        private TextView touristPlacesText;
        private Button bichnakandiButton, jaflongButton, sreemongolButton, lalakhalButton, sunamganjButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_place);  // Make sure the layout file is correct

            // Initialize TextView and Buttons
            touristPlacesText = findViewById(R.id.touristPlacesText);
            bichnakandiButton = findViewById(R.id.bichnakandi);
            jaflongButton = findViewById(R.id.Jaflong);
            sreemongolButton = findViewById(R.id.sreemongol);
            lalakhalButton = findViewById(R.id.lalakhal);
            sunamganjButton = findViewById(R.id.sunamganj);

            // Set click listeners for buttons
            bichnakandiButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Bichnakandi clicked");
                }
            });

            jaflongButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Jaflong clicked");
                }
            });

            sreemongolButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Sreemongol clicked");
                }
            });

            lalakhalButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Lalakhal clicked");
                }
            });

            sunamganjButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast("Sunamganj clicked");
                }
            });
        }

        // Helper method to show a toast message
        private void showToast(String message) {
            Toast.makeText(PlaceActivity.this, message, Toast.LENGTH_SHORT).show();
        }
    }
