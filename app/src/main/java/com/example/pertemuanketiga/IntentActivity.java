package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IntentActivity extends AppCompatActivity {
    private TextView tvTitle, tvDesc;
//    private ImageView ivTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        tvTitle = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);

        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("desc");

        tvTitle.setText(title);
        tvDesc.setText(desc);
    }
}
