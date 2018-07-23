package com.example.dean.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by Dean on 2018/7/23.
 */

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(AnotherActivity.this,"测试",Toast.LENGTH_LONG).show();
        Log.d("SSS","sdf");
    }
}
