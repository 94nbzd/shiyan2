package com.example.asus.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc_2 extends AppCompatActivity {
    private Button button_uc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc_2);
        button_uc2=findViewById(R.id.button_uc2);
        button_uc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(uc_2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
