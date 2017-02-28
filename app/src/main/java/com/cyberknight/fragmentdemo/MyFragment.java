package com.cyberknight.fragmentdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Parth on 28-02-2017.
 * Project FragmentDemo.
 */

public class MyFragment extends Fragment {

    EditText editText;
    Button btnGo;
    TextView textView;
    Context parentContext;

    public MyFragment(){}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        parentContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.my_fragment, container, false);
        editText = (EditText) v.findViewById(R.id.etFragmentEditText);
        btnGo = (Button) v.findViewById(R.id.btnFragmentButton);
        textView = (TextView) v.findViewById(R.id.twFragmentTextView);

        return v;
    }
}
