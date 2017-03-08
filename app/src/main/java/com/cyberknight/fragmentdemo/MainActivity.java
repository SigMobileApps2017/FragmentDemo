package com.cyberknight.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    Button frameChange;
    MyFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout) findViewById(R.id.flFragmentReplace);
        frameChange = (Button) findViewById(R.id.btnFrameChange);

        fragment = new MyFragment();
        final FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.flFragmentReplace,fragment).commit();

        frameChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = fragment.getString();

                MyFragment2 myFragment2 = new MyFragment2();
                myFragment2.setText(text);

                fragmentManager.beginTransaction().replace(R.id.flFragmentReplace, myFragment2).commit();
            }
        });
    }
}
