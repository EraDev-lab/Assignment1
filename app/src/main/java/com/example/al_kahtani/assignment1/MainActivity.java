package com.example.al_kahtani.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity_nadia(View view)
    {
        Intent intent = new Intent(MainActivity.this, nadia.class);
        startActivity(intent);
    }
    public void activity_ahmed(View view)
    {
        Intent intent = new Intent(MainActivity.this, ahmed.class);
        startActivity(intent);
    }
    public void activity_anan(View view)
    {
        Intent intent = new Intent(MainActivity.this, anan.class);
        startActivity(intent);
    }
    public void activity_dody_elgendy(View view)
    {
        Intent intent = new Intent(MainActivity.this, dody_elgendy.class);
        startActivity(intent);
    }
    public void activity_motwkel(View view)
    {
        Intent intent = new Intent(MainActivity.this, motwkel.class);
        startActivity(intent);
    }
    public void activity_rached(View view)
    {
        Intent intent = new Intent(MainActivity.this, rached.class);
        startActivity(intent);
    }
    public void activity_ramy(View view)
    {
        Intent intent = new Intent(MainActivity.this, ramy.class);
        startActivity(intent);
    }
}
