package com.sivaram.session9assignment1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtPageTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type Cast Text View To Change Title
        txtPageTitle = (TextView) findViewById(R.id.txtPageTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Create Options Menu From Menu XML file.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // On Selection of Item in Option Menu. depending on the selection. change textview color.
        // Verify the Selected Option Menu Item Title With The Item of Enum Created in ColourEnum.java
        if (item.getTitle().equals(ColourEnum.AppColours.Red.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed)); // Change TextView Color To Red
        else if (item.getTitle().equals(ColourEnum.AppColours.Green.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen)); // Change TextView Color To Green
        else if (item.getTitle().equals(ColourEnum.AppColours.Blue.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorBlue)); // Change TextView Color To Blue

        return true;
    }
}
