package com.example.forthefilnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener item=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                 Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                } else if (position==1) {
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                } else if (position ==2) {
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                } else if (position ==3) {
                    Intent intent=new Intent(MainActivity.this,MainActivity5.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent=new Intent(MainActivity.this,MainActivity6.class);
                    startActivity(intent);
                } else if (position ==5) {
                    Intent intent=new Intent(MainActivity.this,MainActivity7.class);
                    startActivity(intent);
                } else if (position ==6) {
                    Intent intent=new Intent(MainActivity.this,MainActivity8.class);
                    startActivity(intent);
                } else if (position ==7) {
                    Intent intent=new Intent(MainActivity.this,MainActivity9.class);
                    startActivity(intent);
                } else if (position==8) {
                    Intent intent=new Intent(MainActivity.this,MainActivity10.class);
                    startActivity(intent);
                } else if (position ==9) {
                    Intent intent=new Intent(MainActivity.this,MainActivity11.class);
                    startActivity(intent);
                } else if (position==10) {
                    Intent intent=new Intent(MainActivity.this,MainActivity12.class);
                    startActivity(intent);
                }
            }
        };
       list=findViewById(R.id.list);
        list.setOnItemClickListener(item);
    }
}