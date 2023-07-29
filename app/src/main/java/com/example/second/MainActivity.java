package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 1;
    int set;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void createFile(View v){

        tx=findViewById(R.id.textView);
        Button b=(Button) v;

        if(x%2==0&&set!=1) {
            b.setText("O");
            x++;
            set=resultO();
            v.setEnabled(false);
        }
        else if(set!=1){
            b.setText("X");
            x++;
            set=resultX();
            v.setEnabled(false);
        }



    }
    public int resultX(){
        Button a1=findViewById(R.id.button1);
        Button a2=findViewById(R.id.button2);
        Button a3=findViewById(R.id.button3);
        Button a4=findViewById(R.id.button4);
        Button a5=findViewById(R.id.button5);
        Button a6=findViewById(R.id.button6);
        Button a7=findViewById(R.id.button7);
        Button a8=findViewById(R.id.button8);
        Button a9=findViewById(R.id.button9);
        tx=findViewById(R.id.textView);

        int color= Color.RED;
        if((a1.getText()=="X")&&(a2.getText()=="X")&&(a3.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a4.getText()=="X")&&(a5.getText()=="X")&&(a6.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a7.getText()=="X")&&(a8.getText()=="X")&&(a9.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a1.getText()=="X")&&(a4.getText()=="X")&&(a7.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a2.getText()=="X")&&(a5.getText()=="X")&&(a8.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a3.getText()=="X")&&(a6.getText()=="X")&&(a9.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a1.getText()=="X")&&(a5.getText()=="X")&&(a9.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a3.getText()=="X")&&(a5.getText()=="X")&&(a7.getText()=="X")) {
            tx.setText("😎 X win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else{
            tx.setText("No result");
        }
        return set;

    }
    public int resultO(){
        Button a1=findViewById(R.id.button1);
        Button a2=findViewById(R.id.button2);
        Button a3=findViewById(R.id.button3);
        Button a4=findViewById(R.id.button4);
        Button a5=findViewById(R.id.button5);
        Button a6=findViewById(R.id.button6);
        Button a7=findViewById(R.id.button7);
        Button a8=findViewById(R.id.button8);
        Button a9=findViewById(R.id.button9);
        tx=findViewById(R.id.textView);
        int color= Color.RED;
        if((a1.getText()=="O")&&(a2.getText()=="O")&&(a3.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a4.getText()=="O")&&(a5.getText()=="O")&&(a6.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a7.getText()=="O")&&(a8.getText()=="O")&&(a9.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a1.getText()=="O")&&(a4.getText()=="O")&&(a7.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a2.getText()=="O")&&(a5.getText()=="O")&&(a8.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a3.getText()=="O")&&(a6.getText()=="O")&&(a9.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a1.getText()=="O")&&(a5.getText()=="O")&&(a9.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else if((a3.getText()=="O")&&(a5.getText()=="O")&&(a7.getText()=="O")) {
            tx.setText("🤩 O win!✨🎉");
            tx.setTextColor(color);
            set=1;
        }
        else{
            tx.setText("No result");
        }
        return set;
    }
    public void onResetButtonClick(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}