package com.example.gregoryesrig24.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.gregoryesrig24.finalproject.R.id.getButton;

/**
 * Created by gregoryesrig24 on 4/10/17.
 */
import static com.example.gregoryesrig24.finalproject.R.id.toolbar;

public class GetProfile extends AppCompatActivity {

    private Button getButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getprofile);
        getButton = (Button) findViewById(R.id.getButton);


        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetProfile.this, SelectionActivity.class));
            }
        });

        Toolbar actionBarToolbar = (Toolbar) findViewById(toolbar);
        setSupportActionBar(actionBarToolbar);

        getSupportActionBar().setTitle("");

    }
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();

        if (res_id == R.id.settings) {
            startActivity(new Intent(GetProfile.this, MainActivity.class));
        }

        return true;
    }
}

