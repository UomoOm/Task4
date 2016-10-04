package com.example.om.task4;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class FragmentFirst extends Fragment {

    private FrameLayout fragment_first;

    public static FragmentFirst newInstance() {
        return new FragmentFirst();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        fragment_first = (FrameLayout) root.findViewById(R.id.fragment_first);
        fragment_first.setBackgroundColor(Color.parseColor("#fffff"));
        fragment_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getActivity().getSupportFragmentManager()
                        .findFragmentByTag(FragmentSecond.class.getSimpleName());
                FragmentSecond fragmentSecond = (FragmentSecond) fragment;
                fragmentSecond.setBackgroundColor(Color.parseColor("#faaaf"));
            }
        });
        return root;
    }
}
