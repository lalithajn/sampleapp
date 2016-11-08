package com.cisco.assessmentreports;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class HomePageActivity extends AppCompatActivity {

    // Array of strings...
    String[] mobileArray = {"EnergyWise","IPv6","MediaNet"};
    Button ew,ip,md;
    LinearLayout ewl,ipl,mdl,list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home_page);
        setContentView(R.layout.main);
      ew=(Button)findViewById(R.id.energywise);
        ip=(Button)findViewById(R.id.ipv6);
        md=(Button)findViewById(R.id.medianet);
        ewl=(LinearLayout)findViewById(R.id.ew);
        ipl=(LinearLayout)findViewById(R.id.ip);
        mdl=(LinearLayout)findViewById(R.id.md);
        list=(LinearLayout)findViewById(R.id.list);
        list.setVisibility(LinearLayout.VISIBLE);
        ewl.setVisibility(LinearLayout.INVISIBLE);
        ipl.setVisibility(LinearLayout.INVISIBLE);
        mdl.setVisibility(LinearLayout.INVISIBLE);

        ip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                list.setVisibility(LinearLayout.INVISIBLE);
                ewl.setVisibility(LinearLayout.INVISIBLE);
                ipl.setVisibility(LinearLayout.VISIBLE);
                mdl.setVisibility(LinearLayout.INVISIBLE);
            }
        });
        ew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                list.setVisibility(LinearLayout.INVISIBLE);
                ewl.setVisibility(LinearLayout.VISIBLE);
                ipl.setVisibility(LinearLayout.INVISIBLE);
                mdl.setVisibility(LinearLayout.INVISIBLE);
            }
        });
        md.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                list.setVisibility(LinearLayout.INVISIBLE);
                ewl.setVisibility(LinearLayout.INVISIBLE);
                ipl.setVisibility(LinearLayout.INVISIBLE);
                mdl.setVisibility(LinearLayout.VISIBLE);
            }
        });


     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);*/

    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }*/
    @Override
    public void onBackPressed() {
        // your code.
        list.setVisibility(LinearLayout.VISIBLE);
        ewl.setVisibility(LinearLayout.INVISIBLE);
        ipl.setVisibility(LinearLayout.INVISIBLE);
        mdl.setVisibility(LinearLayout.INVISIBLE);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page, menu);
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
