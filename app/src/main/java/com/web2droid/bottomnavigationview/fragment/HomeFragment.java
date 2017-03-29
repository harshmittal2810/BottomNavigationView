package com.web2droid.bottomnavigationview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.web2droid.bottomnavigationview.R;

/**
 * Created by harsh on 29/03/17.
 */

public class HomeFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        textView = (TextView) view.findViewById(R.id.message);
        String value = getArguments().getString("Value");
        textView.setText(value);
        return view;
    }
}
