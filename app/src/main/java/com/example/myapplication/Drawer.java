package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Drawer extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawerLayout = findViewById(R.id.drawer);
        navigationView =findViewById(R.id.nav);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.recent)
                {
                    Toast.makeText(Drawer.this, "Recent is clicked", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.starred)
                {
                    Toast.makeText(Drawer.this, "Starred is clicked", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }
}