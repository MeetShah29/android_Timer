package com.example.timersdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //CountDownTimer will be destroyed after it is finished, Whereas Handler will still be running even after it is finished.

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {
            //CountDown counting down
                Log.i("Seconds Left", String.valueOf(l/1000));

            }

            @Override
            public void onFinish() {
                //Counter is finished
                Log.i("Done!", "CountDown finished");
            }
        }.start();
       /* final Handler handler=new Handler();
        Runnable run=new Runnable() {
            @Override
            public void run() {
                //Insert Code to run every second
                Log.i("Runnable is ","Running every second");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
*/
    }
}