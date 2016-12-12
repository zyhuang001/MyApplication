package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                EditText question = (EditText)findViewById(R.id.question);
                EditText answer = (EditText)findViewById(R.id.answer);
                answer.setText("你的问题["+question.getText()+"],我回答不了");
            }
        });
    }
}
