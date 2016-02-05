package com.example.gald.myfly.fly_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gald.myfly.R;

public class FlyinMenuSampleActivity extends AppCompatActivity{
    private RootView mRootView;
    private static final String TAG = "FlyInMenuActivity";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.host, new HostFragment()).commit();
//
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(new NavigationItemAdapter(this
//                .getApplicationContext()));
//        listView.setOnItemClickListener(this);

        mRootView = (RootView) findViewById(R.id.root);
    }

    public RootView getRootView() {
        return mRootView;
    }



}