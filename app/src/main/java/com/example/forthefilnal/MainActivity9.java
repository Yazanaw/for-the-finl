package com.example.forthefilnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
Button mape8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        mape8=findViewById(R.id.ma9);
        mape8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDirctions();
            }
        });
    }
    private void getDirctions(){
        try{
            Uri uri= Uri.parse("https://www.google.com/maps/dir/");
            Intent in=new Intent(Intent.ACTION_VIEW,uri);
            in.setPackage("com.google.android.apps.maps");
            in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(in);
        }catch (ActivityNotFoundException exception){
            Uri uri= Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent in=new Intent(Intent.ACTION_VIEW,uri);
            in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(in);
        }
    }
}