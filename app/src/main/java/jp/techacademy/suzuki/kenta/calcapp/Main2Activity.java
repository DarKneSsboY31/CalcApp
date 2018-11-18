package jp.techacademy.suzuki.kenta.calcapp;

import  android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        float data = intent.getFloatExtra("VALUE", 0);

        TextView textview = (TextView)findViewById(R.id.textVieW);
        textview.setText(String.valueOf(data));

    }
}
