package com.example.amitfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {
String country; // to send from  fragment to activity
    String category; // to send from  fragment to activity
    private static final String TAG = "FirstFragment";
FirstInterface firstInterface;
    public FirstFragment(String country, String category, FirstInterface firstInterface) { // to send from  fragment to activity
        this.country = country; // to send from  fragment to activity
        this.category = category; // to send from  fragment to activity
        this.firstInterface=firstInterface;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: ***********"+country + ",,,"+ category);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstInterface.onRunFunction(country,category);// to send from activity to fragment
    }

    public interface FirstInterface{// to send from activity to fragment
     public void onRunFunction(String country,String category);



    }


}