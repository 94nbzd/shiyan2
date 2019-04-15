package com.example.asus.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uc_1 extends AppCompatActivity {
private Button button_uc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc_1);
        button_uc1 =findViewById(R.id.button_uc1);

        button_uc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(uc_1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
