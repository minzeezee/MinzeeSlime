package com.example.minzee.minzeehomwork;

import android.app.Fragment;
import android.app.FragmentManager;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private String TAG;
    FrameLayout fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = findViewById(R.id.mainFragment);

   /*     getFragmentManager()
                .beginTransaction()
                .add(R.id.mainFragment, new fragmentActivity())
                .add(R.id.mainFragment, new fragment2Activity())
                .add(R.id.mainFragment, new fragment3Activity())
                .commit();
*/

     getFragmentManager()
                .beginTransaction()
                .add(R.id.mainFragment, new fragmentActivity())
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.mainFragment, new fragment2Activity())
                .addToBackStack(null)
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.mainFragment,new fragment3Activity())
                .addToBackStack(null)
                .commit();



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
