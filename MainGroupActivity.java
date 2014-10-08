package com.example.nbaez.question;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;

/**
 * Created by nbaez on 10/6/14.
 */
public class MainGroupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // SeeGroups button
        Button viewGroupButton = (Button) findViewById(R.id.viewgroup_button);
        viewGroupButton.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                // GroupListingActivity
                startActivity(new Intent(MainGroupActivity.this, GroupListingActivity.class));
            }
        });

        // CreateGroup
        Button createGroupButton = (Button) findViewById(R.id.creategroup_button);
        createGroupButton.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {

                // popup window
                PopupWindow newGroup = new PopupWindow();
                startActivity(new Intent(newGroup));
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.maingroupactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}




