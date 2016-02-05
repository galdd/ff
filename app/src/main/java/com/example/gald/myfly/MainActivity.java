package com.example.gald.myfly;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.gald.myfly.custom_view.PieChart;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);

        Resources res = getResources();


//        final PieChart pie = (PieChart) this.findViewById(R.id.Pie);
//        pie.addItem("Agamemnon", 2, ContextCompat.getColor(this,R.color.seafoam));
//        pie.addItem("Bocephus", 3.5f,ContextCompat.getColor(this, R.color.chartreuse));
//        pie.addItem("Calliope", 2.5f, ContextCompat.getColor(this,R.color.emerald));
//        pie.addItem("Daedalus", 3, ContextCompat.getColor(this,R.color.bluegrass));
//        pie.addItem("Euripides", 1, ContextCompat.getColor(this,R.color.turquoise));
//        pie.addItem("Ganymede", 3, ContextCompat.getColor(this,R.color.slate));
//
//        ((Button) findViewById(R.id.Reset)).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                pie.setCurrentItem(0);
//            }
//        });

//        Button btn =(Button)findViewById(R.id.button);
//        Button btn2 =(Button)findViewById(R.id.button2);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, FlyinMenuSampleActivity.class);
//                startActivity(intent);
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, FlyNormal.class);
//                startActivity(intent);
//            }
//        });


    }




}
