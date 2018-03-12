package com.win.blog;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText input_tel;
    private Button goto_tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        init();
        initData();
    }
    public void init(){
        input_tel = (EditText)findViewById(R.id.input_tel);
        goto_tel = (Button)findViewById(R.id.goto_tel);
    }
    public void initData(){
        goto_tel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.goto_tel:
                String tel = input_tel.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse(tel));
                startActivity(intent);
                break;
        }
    }
}
