package com.hyperdev.androidme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hyperdev.androidme.R;
import com.hyperdev.androidme.data.AndroidImageAssets;

import fragment.AndroidFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidFragment headFragment = new AndroidFragment();
        headFragment.setWhatPart(AndroidImageAssets.getHeads());
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.headFragment, headFragment)
                .commit();

        AndroidFragment bodyFragment = new AndroidFragment();
        bodyFragment.setWhatPart(AndroidImageAssets.getBodies());
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.bodyFragment, bodyFragment)
                .commit();


        AndroidFragment legsFragment = new AndroidFragment();
        legsFragment.setWhatPart(AndroidImageAssets.getLegs());
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.legsFragment, legsFragment)
                .commit();

    }
}
