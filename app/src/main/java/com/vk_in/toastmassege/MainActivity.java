package com.vk_in.toastmassege;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private int mMinus = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.count);
    }

    public void Toast(View view) {
        Toast.makeText(this, "Top Button Toast", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void Count(View view) {
        ++mCount;
        if (mShowCount != null)
          mShowCount.setText(Integer.toString(mCount));


    }

    @SuppressLint("SetTextI18n")
    public void minus(View view) {
        --mMinus;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mMinus));
    }
}