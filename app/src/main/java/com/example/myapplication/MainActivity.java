package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity {

    private androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.tb);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

        /*MenuItem.OnActionExpandListener onActionExpandListener = new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(@NonNull MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "Expanded", Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(@NonNull MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "Collapsed", Toast.LENGTH_SHORT).show();
                return true;
            }
        };
        menu.findItem(R.id.s).setOnActionExpandListener(onActionExpandListener);
        SearchView searchView = (androidx.appcompat.widget.SearchView) menu.findItem(R.id.s).getActionView();
        searchView.setQueryHint("Type a ....");*/




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.s)
        {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.settings)
        {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( MainActivity.this, Drawer.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.notification)
        {
            ///Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( MainActivity.this, Notification.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.n)
        {
            ///Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( MainActivity.this, Bottom.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}