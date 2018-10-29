package com.cji.edu.intent_treebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 이미지 연결, 리스너에 등록
        Button buttonSample = findViewById(R.id.buttonSample);
        buttonSample.setOnClickListener(this);

        Button buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);

        Button buttonListView = findViewById(R.id.buttonListView);
        buttonListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // 인텐트 생성 및 시작
        Intent intent;
        intent = new Intent(this, ExplicitActivity.class);
        startActivity(intent);

    }
}
