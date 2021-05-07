package com.example.amitfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FirstFragment("egypt","sport", firstInterface)).commit();

    }

    public void second(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new SecondFragment()).commit();
    }

    public void first(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FirstFragment("egypt","sport",firstInterface)).commit();

    }
    FirstFragment.FirstInterface firstInterface= new FirstFragment.FirstInterface() { // to send from activity to fragment
        @Override
        public void onRunFunction(String country, String category) {
            Log.i(TAG, "onRunFunction: ############"+country+category);
        }
    };


}