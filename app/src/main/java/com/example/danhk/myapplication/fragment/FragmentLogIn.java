package com.example.danhk.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danhk.myapplication.R;

/**
 * Created by danhk on 26-Mar-16.
 */
public class FragmentLogIn extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = null;
        myView = inflater.inflate(R.layout.fragment_layout, container,false);
        return myView;

    }
}
