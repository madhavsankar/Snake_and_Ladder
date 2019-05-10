package com.example.madhav.snakeandladder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        Intent intent = getIntent();
        int a = intent.getIntExtra("winner",2);
        TextView textView = findViewById(R.id.textView);
        if(a == 1)
            textView.setText("A Won");
        else
            textView.setText("B Won");
    }

    public void fun(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
