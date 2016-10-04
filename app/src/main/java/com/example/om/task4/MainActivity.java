package com.example.om.task4;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Random;

//4.​ ​Расположить​ ​на​ ​экране​ ​4​ ​фрагмента.​ ​По​ ​клику​ ​на​ ​любой​ ​из​ ​них​ ​менять​ ​цвет​ ​3х​ ​других
//        фрагментов
//        (view.setBackgroundColor(Color.parseColor("#fffff"));).​ ​Цвета​ ​должны​ ​быть​ ​заданы​ ​в​ ​массиве​
// ​(примерно 10​ ​штук).​ ​После​ ​смены​ ​цвета​ ​не​ ​должно​ ​оказаться​ ​одинаковых​ ​фрагментов.

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickFragmentFirst(View view) {

        view.setBackgroundColor(Color.parseColor("#C0C0C0"));

    }

    public void clickFragmentSecond(View view) {

        view.setBackgroundColor(Color.parseColor("#00ffff"));
    }

    public void clickFragmentThird(View view) {

        view.setBackgroundColor(Color.parseColor("#808000"));
    }

    public void clickFragmentForth(View view) {

        view.setBackgroundColor(Color.parseColor("#FFFF00"));
    }

    private void ChangeColor() {

        color = new ArrayList<>();

        color.add("#000000");
        color.add("#C0C0C0");
        color.add("#800080");
        color.add("#808000");
        color.add("#008080");
        color.add("#00ffff");
        color.add("#000080");
        color.add("#FFFF00");
        color.add("#00FFFF");
        color.add("#CC3300");
    }
}
