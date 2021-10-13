package com.zakariaahnaf.basicjava_cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String NameRollEmailStr = "Md Zakaria-202111059074-zakaria112203@gmail.com";
        String[] NameRollEmailArray = NameRollEmailStr.split("-");

        System.out.println("Name - "+NameRollEmailArray[0]);
        System.out.println("ID - "+NameRollEmailArray[1]);
        System.out.println("Email - "+NameRollEmailArray[2]);


        System.out.printf("%s\n%10s\n%-10s\n","Hello","Hello","Hello");


        double doubleNuber=15.57645;
        DoubleValuePrint.DoubleCall(doubleNuber);

    }
}