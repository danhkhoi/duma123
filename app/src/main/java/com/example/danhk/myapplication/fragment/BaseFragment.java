package com.example.danhk.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;

import com.example.danhk.myapplication.*;
/**
 * Created by danhk on 26-Mar-16.
 */
public class BaseFragment extends Fragment {



    public void pushFragment(FragmentsID fragment, Bundle bundle){
        MainActivity activity = (MainActivity) getActivity();
        activity.pushFragment(fragment, bundle, true);
    }
}
