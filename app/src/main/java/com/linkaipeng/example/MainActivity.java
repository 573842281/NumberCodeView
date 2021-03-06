package com.linkaipeng.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.linkaipeng.numbercodeview.NumberCodeView;
import com.linkaipeng.numbercodeview.R;

public class MainActivity extends AppCompatActivity {

    private NumberCodeView mNumberCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mNumberCodeView = (NumberCodeView) findViewById(R.id.numberCodeView);
        mNumberCodeView.setNumberCodeCallback(new NumberCodeView.OnInputNumberCodeCallback() {
            @Override
            public void onResult(String code) {
                Toast.makeText(MainActivity.this, code, Toast.LENGTH_LONG).show();
            }
        });
    }


}
