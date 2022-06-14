package com.example.bigger_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewNumberGame();
    }


        private void NewNumberGame() {
            Random n = new Random();
            num1 = n.nextInt(10);
            num2 = n.nextInt(10);
            while (num2 == num1){
                num2 = n.nextInt(10);
            }
            Button button1 = (Button) findViewById(R.id.button1);
            button1.setText(Integer.toString(num1));
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setText(Integer.toString(num2));

        }

        public void OnClickbutton1(View view) {
            TextView point = (TextView) findViewById(R.id.point);
            int points = Integer.parseInt(point.getText().toString());
            if (num1>num2){
                points+=1;
                Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
            }
            else{
                points-=1;
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
            }
            NewNumberGame();
            point.setText((String.valueOf(points)));

        }


        public void OnClickbutton2(View view) {
            TextView point = (TextView) findViewById(R.id.point);
            int points = Integer.parseInt(point.getText().toString());
            if (num2>num1){
                points+=1;
                Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
            }
            else{
                points-=1;
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
            }
            NewNumberGame();
            point.setText((String.valueOf(points)));

        }



}