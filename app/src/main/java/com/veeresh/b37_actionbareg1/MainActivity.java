package com.veeresh.b37_actionbareg1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //WE CAN ENABLE <- BACK BUTTON ON ACTION BAR WITH BELOW CODE
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //WE CAN CHANGE TITLE OF THE ACTION BAR BY USING BELOW CODE
        getSupportActionBar().setTitle("HELLO");
        //WE CAN ALSO REMOVE TITLE OF ACTION BAR BY USING BELOW CODE
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //SHER LOCK LIBRARY - github - if you want any major modifications for actionbar.
        getSupportActionBar().hide();
        getSupportActionBar().show();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
        //HERE WE WILL HANDLE ACTION BAR ITEM CLICKS - USING SWITCH CASE STATEMENT
        switch (id){
            case android.R.id.home: //IF USER CLICKS <- BUTTON ON ACTION BAR, THEN O.S COMES HERE.
                finish();
                break;
            case R.id.placments:
                Toast.makeText(this, "IAM PLACED", Toast.LENGTH_SHORT).show();
                break;
            case R.id.call:
                Toast.makeText(this, "IM CALLING", Toast.LENGTH_SHORT).show();
                break;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
