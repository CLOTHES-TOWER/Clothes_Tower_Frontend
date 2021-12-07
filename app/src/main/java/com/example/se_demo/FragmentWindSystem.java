package com.example.se_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class FragmentWindSystem extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wind, container, false);

        Button windyes = (Button)view.findViewById(R.id.windYes);
        Button windno = (Button)view.findViewById(R.id.windNo);
        ImageView gif_id = (ImageView)view.findViewById(R.id.gif_id);

        Glide.with(this).load(R.raw.ventilation).into(gif_id);

        windyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InitialScreen.class);
                Toast toast = Toast.makeText(getActivity(), "환기시스템이 예약되었습니다", Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);

            }
        });

        windno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InitialScreen.class);
                Toast toast = Toast.makeText(getActivity(), "환기시스템을 예약하지 않으셨습니다", Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);
            }
        });

        return view;
    }
}
