package com.example.devendratadiyal.fragmenttutorial;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements FirstFragment.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void FragmentOneClick(View view) {
        Fragment myfragment;
        myfragment = new Five();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.main2, myfragment);
        fragmentTransaction.commit();

    }
    public void FragmentTwoClick(View view) {
        Fragment myfragment;
        myfragment = new Six();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.main2, myfragment);
        fragmentTransaction.commit();

    }

    @Override
    public void sendData(String message) {


        SecondFragment frag = (SecondFragment)getFragmentManager().findFragmentById(R.id.f2);
        frag.getData(message);
    }


}
