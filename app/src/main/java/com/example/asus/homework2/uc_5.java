package com.example.asus.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc_5 extends AppCompatActivity {
    private Button button_uc5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc_5);
        button_uc5=findViewById(R.id.button_uc5);
        button_uc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(uc_5.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
