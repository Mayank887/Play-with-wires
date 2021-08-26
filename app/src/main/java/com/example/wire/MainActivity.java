package com.example.wire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,textView;
    Vibrator vibrator;


    int x;
    int RED=R.color.red;
    int BLUE=R.color.blue;
    int GREEN=R.color.green;
    int arr[]=new int[6];
    int c=0;

    TextView[] tv=new TextView[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        arr[0]=RED;
        arr[1]=BLUE;
        arr[2]=RED;
        arr[3]=GREEN;
        arr[4]=BLUE;
        arr[5]=GREEN;
        textView=findViewById(R.id.textView7);


        tv[0]=findViewById(R.id.textView);
        tv[1]=findViewById(R.id.textView2);
        tv[2]=findViewById(R.id.textView3);
        tv[3]=findViewById(R.id.textView4);
        tv[4]=findViewById(R.id.textView5);
        tv[5]=findViewById(R.id.textView6);
        setcolor();



        tv[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=0;
                    tv[0].setText("Selected");
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[0];
                    arr[0]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });
        tv[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=1;
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[1];
                    arr[1]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });
        tv[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=2;
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[2];
                    arr[2]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });
        tv[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=3;
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[3];
                    arr[3]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });
        tv[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=4;
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[4];
                    arr[4]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });
        tv[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c==0){
                    vibrator.vibrate(100);
                    x=5;
                    c++;}
                else if(c==1){

                    c=0;
                    int temp=arr[5];
                    arr[5]=arr[x];
                    arr[x]=temp;
                    setcolor();
                    check();
                }



            }
        });




    }

    private void setcolor() {
        tv[0].setBackgroundResource(arr[0]);
        tv[1].setBackgroundResource(arr[1]);
        tv[2].setBackgroundResource(arr[2]);
        tv[3].setBackgroundResource(arr[3]);
        tv[4].setBackgroundResource(arr[4]);
        tv[5].setBackgroundResource(arr[5]);
    }
    private void check(){
        if((arr[0]==arr[1]) && (arr[2]==arr[3]) && (arr[4]==arr[5])) {
            vibrator.vibrate(3000);
            textView.setText("DONE");

        }
    }
}