package com.example.devendratadiyal.fragmenttutorial;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    SendMessage SM;
    Button b;
            EditText et;
    public FirstFragment() {
        // Required empty public constructor
    }

    interface SendMessage
    {
        public void sendData(String message);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try
        {
          SM = (SendMessage)activity;
            System.out.println("INTERFACE HAS BEEN CREATED ");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("HELLO DEV CREATE A SEND MESSAGE INTERFACE AGAIN");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_one, container, false);

         b = (Button) root.findViewById(R.id.send);
         et = (EditText) root.findViewById(R.id.gettext);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = et.getText().toString();
                System.out.println("Typed value "+a);
                SM.sendData(a);
            }
        });


        return root;
    }



}
