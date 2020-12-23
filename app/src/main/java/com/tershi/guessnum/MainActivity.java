package com.tershi.guessnum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView number;
    EditText inputNum;
    Button btnGuess;
    int r = (int)(Math.random() *100) + 1;
    int max = 100 , min = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (TextView)findViewById(R.id.number);
        inputNum = (EditText)findViewById(R.id.inputNum);
        btnGuess = (Button)findViewById(R.id.btnGuess);

    }
    public void btnGuess(View view){
        if (Integer.parseInt(inputNum.getText().toString()) > r){
            max = Integer.parseInt(inputNum.getText().toString());
            number.setText(min + "~" + max);
        } else if (Integer.parseInt(inputNum.getText().toString()) == r){
            number.setText("你猜中了！！YA");
        } else if (Integer.parseInt(inputNum.getText().toString()) < r){
            min = Integer.parseInt(inputNum.getText().toString());
            number.setText(min + "~" + max);
        }
    }
}