package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    BottleDispenser BD = BottleDispenser.getInstance();

    public void addMoney(View v) {
        TextView tv1 = (TextView)findViewById(R.id.textViewConsole);
        TextView tv2 = (TextView)findViewById(R.id.moneyWindow);
        BD.addMoney(tv1, tv2);
    }

    public void buyBottle(View v) {
        TextView tv1 = (TextView)findViewById(R.id.textViewConsole);
        TextView tv2 = (TextView)findViewById(R.id.moneyWindow);
        BD.buyBottle(tv1, tv2);
    }

    public void returnMoney(View v) {
        TextView tv1 = (TextView)findViewById(R.id.textViewConsole);
        TextView tv2 = (TextView)findViewById(R.id.moneyWindow);
        BD.returnMoney(tv1, tv2);

    }

    public void listBottles(View v) {
        TextView tv1 = (TextView)findViewById(R.id.textViewConsole);
        BD.listBottles(tv1);


    }


}