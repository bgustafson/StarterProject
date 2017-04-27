package com.example.brigus.starterproject;

import android.support.v4.app.Fragment;

public class MainActivity extends FragmentHostActivity {

    @Override
    protected Fragment createFragment() {

        return SampleFragment.newInstance();
    }
}
