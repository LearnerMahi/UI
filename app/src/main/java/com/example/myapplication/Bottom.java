package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.h1)
                {
                    Toast.makeText(Bottom.this, "Home 1", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.h2)
                {
                    Toast.makeText(Bottom.this, "Home 2", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.h3)
                {
                    Toast.makeText(Bottom.this, "Home 3", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.h4)
                {
                    Toast.makeText(Bottom.this, "Home 4", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });



    }
}