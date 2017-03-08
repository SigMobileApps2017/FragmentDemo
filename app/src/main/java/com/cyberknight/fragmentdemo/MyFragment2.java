package com.cyberknight.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Parth on 08-03-2017.
 * Project FragmentDemo.
 */

public class MyFragment2 extends Fragment{

    private TextView displayString;
    private String text;

    public MyFragment2(){}

    public void setText(String text){
        this.text = text;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.my_fragment_2, container, false);

        displayString = (TextView) v.findViewById(R.id.tvStringGoesHere);
        displayString.setText(text);

        return v;
    }
}
