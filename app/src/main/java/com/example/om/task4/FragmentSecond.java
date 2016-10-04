package com.example.om.task4;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


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
        fragment_second.setBackgroundColor(Color.parseColor("#808000"));
        return root;
    }
}
