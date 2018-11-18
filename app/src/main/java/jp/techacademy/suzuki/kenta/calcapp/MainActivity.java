package jp.techacademy.suzuki.kenta.calcapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //EditTextを2つ設定
    EditText edittext1;
    EditText edittext2;

    //変更可能テキストの設定
    Editable getText1;
    Editable getText2;

    //数値の設定
    float float_text1;
    float float_text2;
    float float_textplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン4つとEditText2つを定義
        Button buttoN = (Button)findViewById(R.id.button1);
        buttoN.setOnClickListener(this);

        Button buttoN2 = (Button) findViewById(R.id.button2);
        buttoN2.setOnClickListener(this);

        Button buttoN3 = (Button) findViewById(R.id.button3);
        buttoN3.setOnClickListener(this);

        Button buttoN4 = (Button) findViewById(R.id.button4);
        buttoN4.setOnClickListener(this);

        edittext1 = (EditText)findViewById(R.id.TextEdit1);
        edittext2= (EditText)findViewById(R.id.TextEdit2);
    }

    @Override
    public void onClick(View v) {
        //エラーが出ないように例外処理を設定
       try {
           //「+」を押した時
           if (v.getId() == R.id.button1) {

                getText1 = edittext1.getText();
                getText2 = edittext2.getText();
                float_text1 = Float.parseFloat(getText1.toString());
                float_text2 = Float.parseFloat(getText2.toString());
                float_textplus = float_text1 + float_text2;
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("VALUE", float_textplus);
                startActivity(intent);

           //「-」を押した時
           } else if (v.getId() == R.id.button2) {

               getText1 = edittext1.getText();
               getText2 = edittext2.getText();
               float_text1 = Float.parseFloat(getText1.toString());
               float_text2 = Float.parseFloat(getText2.toString());
               float_textplus = float_text1 - float_text2;
               Intent intent = new Intent(this, Main2Activity.class);
               intent.putExtra("VALUE", float_textplus);
               startActivity(intent);

           //「×」を押した時
           } else if (v.getId() == R.id.button3) {

               getText1 = edittext1.getText();
               getText2 = edittext2.getText();
               float_text1 = Float.parseFloat(getText1.toString());
               float_text2 = Float.parseFloat(getText2.toString());
               float_textplus = float_text1 * float_text2;
               Intent intent = new Intent(this, Main2Activity.class);
               intent.putExtra("VALUE", float_textplus);
               startActivity(intent);

           //「÷」を押したとき
           }else  {

               getText1 = edittext1.getText();
               getText2 = edittext2.getText();
               float_text1 = Float.parseFloat(getText1.toString());
               float_text2 = Float.parseFloat(getText2.toString());
               float_textplus = float_text1 / float_text2;
               Intent intent = new Intent(this, Main2Activity.class);
               intent.putExtra("VALUE", float_textplus);
               startActivity(intent);

           }
       }catch (Exception e){
           //エラーが出た時、文字列を赤く表示
           TextView error = (TextView)findViewById(R.id.TextView);
           error.setText("数字を入れなさい");
           error.setTextColor(Color.parseColor("#FF0000"));

       }
    }
}
