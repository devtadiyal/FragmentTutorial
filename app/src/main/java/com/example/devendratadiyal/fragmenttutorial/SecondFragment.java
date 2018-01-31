package com.example.devendratadiyal.fragmenttutorial;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    TextView tv;
    Button phonebookBtn,aboutBtn;
    Fragment myfragment;
    public SecondFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_second, container, false);

        tv = (TextView) root.findViewById(R.id.showtext);
        aboutBtn = (Button) root.findViewById(R.id.button11);
        phonebookBtn = (Button) root.findViewById(R.id.button22);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Fragment myfragment = new Third();

                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.main, myfragment);
                fragmentTransaction.commit();
            }
        });

        phonebookBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                Fragment myfragment = new Fourth();

                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.main, myfragment);
                fragmentTransaction.commit();
            }
        });


        return root;
    }



    public void getData(String message)
    {
        tv.setText(message);
    }

}
