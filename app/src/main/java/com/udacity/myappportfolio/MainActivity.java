package com.udacity.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_spotify = (Button)this.findViewById(R.id.button_spotify);
        button_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch spotify app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_scores = (Button)this.findViewById(R.id.button_scores);
        button_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_library = (Button)this.findViewById(R.id.button_library);
        button_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch library app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_build_it_bigger = (Button)this.findViewById(R.id.button_build_it_bigger);
        button_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_xyz_reader = (Button)this.findViewById(R.id.button_xyz_reader);
        button_xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch xyz reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_my_own_app = (Button)this.findViewById(R.id.button_my_own_app);
        button_my_own_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
