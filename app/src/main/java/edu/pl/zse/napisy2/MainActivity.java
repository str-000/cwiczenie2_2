package edu.pl.zse.napisy2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textElement = findViewById(R.id.textView2);

        int max = 255;
        int min = 0;

        short R = (short) Math.floor(Math.random()*(max-min+1)+min);;
        short G = (short) Math.floor(Math.random()*(max-min+1)+min);;
        short B = (short) Math.floor(Math.random()*(max-min+1)+min);;

        textElement.setTextColor(Color.rgb(R, G, B));
    }
}