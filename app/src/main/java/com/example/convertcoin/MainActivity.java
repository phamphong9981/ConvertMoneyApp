package com.example.convertcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerTop,spinnerBot;
    TextView textTop, textBot, textRate;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    ImageView iconTop,iconBot;
    int topI, BotI;//thu tu duoc chon trong cac spinner
    Country countryTop, countryBot;
    ArrayList<Country> arrayList;
    double rate, valueTop,valueBot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        //Khoi tao gia tri Country
        arrayList=new ArrayList<>();
        arrayList.add(new Country("UnitedState - Dollar", getResources().getStringArray(R.array.UnitedState)));
        arrayList.add(new Country("VietNam - Dong", getResources().getStringArray(R.array.VietNam)));
        arrayList.add(new Country("England - Pound", getResources().getStringArray(R.array.England)));
        arrayList.add(new Country("Malaysia - Ringgit", getResources().getStringArray(R.array.Malaysia)));
        arrayList.add(new Country("Uruguay - Peso", getResources().getStringArray(R.array.Uruguay)));
        countryTop=arrayList.get(0);
        countryBot=arrayList.get(0);
        rate=Double.parseDouble(countryTop.getArray()[1])/Double.parseDouble(countryBot.getArray()[1]);

        //Tao adapter va gan adapter cho Spinner
        SpinnerAdapter spinnerAdapter=new SpinnerAdapter(arrayList,this);
        spinnerTop.setAdapter(spinnerAdapter);
        spinnerBot.setAdapter(spinnerAdapter);

        //Tao su kien spinner
        spinnerTop.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                /*iconTop.setImageResource(Integer.parseInt(arrayList.get(position).getArray()[2]));*/
                countryTop=arrayList.get(position);
                rate=Double.parseDouble(countryTop.getArray()[1])/Double.parseDouble(countryBot.getArray()[1]);
                valueBot=Double.parseDouble(textBot.getText().toString());
                if(valueBot==0){
                    textTop.setText("0");
                }else{
                    textTop.setText(String.format("%.2f",valueBot/rate));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerBot.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                /*iconTop.setImageResource(Integer.parseInt(arrayList.get(position).getArray()[2]));*/
                countryBot=arrayList.get(position);
                rate=Double.parseDouble(countryTop.getArray()[1])/Double.parseDouble(countryBot.getArray()[1]);
                valueTop=Double.parseDouble(textTop.getText().toString());
                textBot.setText(String.format("%.2f",valueTop*rate));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Tao su kien button
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTop.setText("0");
                textBot.setText("0");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.length()==1){
                    textTop.setText("0");
                    textBot.setText("0");
                }else{
                    textTop.setText(text.substring(0,text.length()-1));
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("7");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"7");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("8");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"8");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("9");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"9");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("4");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"4");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("5");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"5");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("6");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"6");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("1");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"1");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("2");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"2");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("3");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"3");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.equals("0")){
                    textTop.setText("0");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }else{
                    textTop.setText(textTop.getText()+"0");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textTop.getText().toString();
                if (text.contains(".")==true);
                else{
                    textTop.setText(textTop.getText()+".");
                    valueTop=Double.parseDouble(textTop.getText().toString());
                    textBot.setText(String.format("%.2f",valueTop*rate));
                }
            }
        });

        textTop.setText("0");
        textBot.setText("0");
    }

    void AnhXa(){
        spinnerBot=findViewById(R.id.spinnerBot);
        spinnerTop=findViewById(R.id.spinnerTop);
        textBot=findViewById(R.id.textBot);
        textTop=findViewById(R.id.textTop);
        textRate=findViewById(R.id.textRate);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        iconTop=findViewById(R.id.iconTop);
        iconBot=findViewById(R.id.iconBot);
    }
}
