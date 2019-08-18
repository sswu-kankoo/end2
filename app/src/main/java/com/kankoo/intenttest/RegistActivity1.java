package com.kankoo.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist1);

        //취소 누르면 메인화면으로 전환
        Button ChsRegist = (Button) findViewById(R.id.btnCancel);
        ChsRegist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(Intent, 100);
            }
        });

    }
}
