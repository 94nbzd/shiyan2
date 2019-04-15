package com.example.asus.homework2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class uc_3 extends Activity {
    private AdapterViewFlipper adapterViewFlipper;
    private int img[]=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    private Button button_uc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc_3);
        adapterViewFlipper=findViewById(R.id.id_avf);
        button_uc3 =  findViewById(R.id.button_uc3 ) ;
        button_uc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转页面到uc1
                Intent intent =new Intent(uc_3 .this,MainActivity .class) ;
                startActivity(intent);
            }
        });
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return img.length;
            }

            @Override
            public Object getItem(int i) {
                return img[i];
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                ImageView imageView=new ImageView(uc_3 .this);
                imageView.setImageResource(img[i]);
                return imageView;
            }
        };
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setFlipInterval(5000);
        adapterViewFlipper.setAutoStart(true);
    }
}