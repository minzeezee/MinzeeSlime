package com.example.minzee.minzeehomwork;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private String TAG = "액티비티 생명주기";
    private Fragment firstFragment, secondFragment, thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 생성하기
        Button firstButton = findViewById(R.id.btn_firstFragment);
        Button secondButton = findViewById(R.id.btn_secondFragment);
        Button thirdButton = findViewById(R.id.btn_thirdFragment);

        //연결시켜줄 프래그먼트 생성하기
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        //버튼을 클리하면 무엇을 할지 정해주기
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        //첫번째 프래그먼트 전환하기
                        .replace(R.id.mainFragment, firstFragment)
                        .commit();
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        //첫번째 프래그먼트 전환하기
                        .replace(R.id.mainFragment, secondFragment)
                        .commit();
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        //첫번째 프래그먼트 전환하기
                        .replace(R.id.mainFragment, thirdFragment)
                        .commit();
            }
        });

    }


    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onSrart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
    }

}
