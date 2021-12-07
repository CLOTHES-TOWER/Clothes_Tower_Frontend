package com.example.se_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDrawer extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_drawer, container, false);

        Button drawer1_temp = (Button)view.findViewById(R.id.drawer1_temp);
        Button drawer1_hum = (Button)view.findViewById(R.id.drawer1_hum);


        drawer1_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Temp_dialog oDialog = new Temp_dialog(getActivity());
                oDialog.setCancelable(false);
                oDialog.show();
            }
        });
        drawer1_hum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Hum_dialog oDialog = new Hum_dialog(getActivity());
                oDialog.setCancelable(false);
                oDialog.show();
            }
        });
        return view;
    }


}
