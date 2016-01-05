package com.ouyang.databinding.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ouyang.databinding.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_normal;
    private Button btn_async1;
    private Button btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        btn_normal = (Button) findViewById(R.id.btn_normal);
        btn_async1 = (Button) findViewById(R.id.btn_async1);
        btn_list = (Button) findViewById(R.id.btn_list);
    }

    private void setListener() {
        btn_normal.setOnClickListener(this);
        btn_async1.setOnClickListener(this);
        btn_list.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_normal:
                intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_async1:
                intent = new Intent(MainActivity.this, SyncOneActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_list:
                intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
                break;
        }
    }
}
