package com.example.danhk.myapplication;
import android.app.Activity;
import android.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.danhk.myapplication.fragment.*;

public class MainActivity extends Activity {

    public void pushFragment(FragmentsID frag, Bundle bundle, boolean addBackStack){

        BaseFragment newFg = null;

        if (frag == FragmentsID.LogIn_Fragment) {
            newFg = new FragmentLogIn();
        }
        //else if (frag == FragmentsID.GET_FRAGMENT) {
      //      newFg = new MethodGetFragment();
      //  }

        if (newFg==null) {
            Toast.makeText(this, "not found this fragment", Toast.LENGTH_SHORT).show();
            return;
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.fragment_content, newFg);

        if (addBackStack) {
            ft.addToBackStack(frag.getKey());
        }

        ft.commit();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      pushFragment(FragmentsID.LogIn_Fragment, null, false);

    }

}
