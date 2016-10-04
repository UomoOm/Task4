package com.example.om.task4;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class FragmentSecond extends Fragment {

    private FrameLayout fragment_second;

    public static FragmentSecond newInstance() {
        return new FragmentSecond();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_second, container, false);
        fragment_second = (FrameLayout) root.findViewById(R.id.fragment_second);
        return root;
    }

    public void setBackgroundColor(int color) {
        root.setBackgroundColor(color);
    }
}
