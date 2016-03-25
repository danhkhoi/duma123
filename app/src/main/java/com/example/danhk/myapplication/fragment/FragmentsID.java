package com.example.danhk.myapplication.fragment;

import android.app.Fragment;

/**
 * Created by danhk on 26-Mar-16.
 */

public enum FragmentsID {

    LogIn_Fragment("LOGIN"),
    Home_Fragment("HOME"),
    GET_FRAGMENT("GET");

    private String key;

    private FragmentsID(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }

}
