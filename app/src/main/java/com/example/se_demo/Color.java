package com.example.se_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class Color extends AppCompatActivity {
    JSONObject jsonData;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color);

        CheckBox color_red = (CheckBox) findViewById(R.id.checkBoxcolor1);
        CheckBox color_orange = (CheckBox) findViewById(R.id.checkBoxcolor2);
        CheckBox color_yellow = (CheckBox) findViewById(R.id.checkBoxcolor3);
        CheckBox color_green = (CheckBox) findViewById(R.id.checkBoxcolor4);
        CheckBox color_blue = (CheckBox) findViewById(R.id.checkBoxcolor5);
        CheckBox color_gray = (CheckBox) findViewById(R.id.checkBoxcolor6);
        CheckBox color_black = (CheckBox) findViewById(R.id.checkBoxcolor7);
        CheckBox color_white = (CheckBox) findViewById(R.id.checkBoxcolor8);
        Intent intent = getIntent();

        try {
            jsonData = new JSONObject(intent.getStringExtra("jsonData"));
            System.out.println(jsonData.toString());
        }catch(JSONException e){
            e.printStackTrace();
        }

        color_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "red");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "orange");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "yellow");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "green");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "blue");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "gray");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "black");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });

        color_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Material.class);
                try {
                    jsonData.put("color", "white");
                }catch(JSONException e){
                    e.printStackTrace();
                }
                intent.putExtra("jsonData", jsonData.toString());
                startActivity(intent);
            }
        });
    }
}
