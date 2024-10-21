package com.example.drawingapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private DrawingView drawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = findViewById(R.id.drawing_view);

        Button colorRed = findViewById(R.id.color_red);
        Button colorBlue = findViewById(R.id.color_blue);
        Button colorGreen = findViewById(R.id.color_green);
        Button colorYellow = findViewById(R.id.color_yellow);

        // Set click listeners for each color button
        colorRed.setOnClickListener(v -> drawingView.setColor(Color.RED));
        colorBlue.setOnClickListener(v -> drawingView.setColor(Color.BLUE));
        colorGreen.setOnClickListener(v -> drawingView.setColor(Color.GREEN));
        colorYellow.setOnClickListener(v -> drawingView.setColor(Color.YELLOW));
    }
}