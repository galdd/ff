package com.example.gald.myfly.fly_normal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gald.myfly.R;

public class FlyNormal extends AppCompatActivity{
    private RootViewClasic mRootView;
    private static final String TAG = "FlyInMenuActivity";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classic_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.host, new NormalHostFragment()).commit();
//
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(new NavigationItemAdapter(this
//                .getApplicationContext()));
//        listView.setOnItemClickListener(this);

        mRootView = (RootViewClasic) findViewById(R.id.root);
    }

    public RootViewClasic getRootView() {
        return mRootView;
    }



}