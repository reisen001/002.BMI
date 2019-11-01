package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    private Button math;
    private EditText editText_Weight, editText_Height;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        math = (Button) findViewById(R.id.button_math);
        math.setOnClickListener(mathOnClick);
        editText_Weight =(EditText)findViewById(R.id.editText_Weight);
        editText_Height = (EditText)findViewById(R.id.editText_Height);
        answer =(TextView)findViewById(R.id.answer);
    }
    private View.OnClickListener mathOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            float ans;
            float weight = Float.parseFloat(editText_Weight.getText().toString());
            float height = Float.parseFloat(editText_Height.getText().toString());
            height = height/100;
            height = height*height;
            ans = weight/(height);
            answer.setText(String.format("%.2f",ans));

        }
    };


}
