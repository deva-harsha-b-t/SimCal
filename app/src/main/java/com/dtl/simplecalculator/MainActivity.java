package com.dtl.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

enum operators{
    PLUS,MIN,MUL,DIV,NOSTATE
}

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button[] numbers = new Button[10];
    Button plus,minus,X,div,eq,c;
    TextView result;
    operators currOperator;
    String no1,no2;
    int numberFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1="";
        no2="";
        numberFlag=1;
        numbers[0] = findViewById(R.id.button_0);
        numbers[1] = findViewById(R.id.button_1);
        numbers[2] = findViewById(R.id.button_2);
        numbers[3] = findViewById(R.id.button_3);
        numbers[4] = findViewById(R.id.button_4);
        numbers[5] = findViewById(R.id.button_5);
        numbers[6] = findViewById(R.id.button_6);
        numbers[7] = findViewById(R.id.button_7);
        numbers[8] = findViewById(R.id.button_8);
        numbers[9] = findViewById(R.id.button_9);
        plus = findViewById(R.id.button_plus);
        X = findViewById(R.id.button_X);
        minus = findViewById(R.id.button_min);
        div = findViewById(R.id.button_div);
        c = findViewById(R.id.button_c);
        eq = findViewById(R.id.button_equals);
        plus.setOnClickListener(this);
        X.setOnClickListener(this);
        minus.setOnClickListener(this);
        div.setOnClickListener(this);
        c.setOnClickListener(this);
        eq.setOnClickListener(this);
        result = findViewById(R.id.result);
        for(int i=0;i<10;i++){
            numbers[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_c:
                no1 = "";
                no2 = "";
                currOperator = operators.NOSTATE;
                numberFlag = 1;
                result.setText("");
                break;
            case R.id.button_0:
                if(numberFlag == 1){
                    no1= no1+"0";
                    result.setText(no1);
                }else{
                    no2 = no2+"0";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
            break;
            case R.id.button_1:
                if(numberFlag == 1){
                    no1= no1+"1";
                    result.setText(no1);
                }else{
                    no2 = no2+'1';
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_2:
                if(numberFlag == 1){
                    no1= no1+"2";
                    result.setText(no1);
                }else{
                    no2 = no2+"2";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_3:
                if(numberFlag == 1){
                    no1= no1+"3";
                    result.setText(no1);
                }else{
                    no2 = no2+"3";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_4:
                if(numberFlag == 1){
                    no1= no1+"4";
                    result.setText(no1);
                }else{
                    no2 = no2+"4";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_5:
                if(numberFlag == 1){
                    no1= no1+"5";
                    result.setText(no1);
                }else{
                    no2 = no2+"5";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_6:
                if(numberFlag == 1){
                    no1= no1+"6";
                    result.setText(no1);
                }else{
                    no2 = no2+"6";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_7:
                if(numberFlag == 1){
                    no1= no1+"7";
                    result.setText(no1);
                }else{
                    no2 = no2+"7";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_8:
                if(numberFlag == 1){
                    no1= no1+"8";
                    result.setText(no1);
                }else{
                    no2 = no2+"8";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_9:
                if(numberFlag == 1){
                    no1= no1+"9";
                    result.setText(no1);
                }else{
                    no2 = no2+"9";
                    result.setText(no1 + enumToString(currOperator) + no2);
                }
                break;
            case R.id.button_plus:
                numberFlag = 2;
                currOperator = operators.PLUS;
                result.setText(no1 + enumToString(currOperator) + no2);
                break;
            case R.id.button_min:
                numberFlag = 2;
                currOperator = operators.MIN;
                result.setText(no1 + enumToString(currOperator) + no2);
                break;
            case R.id.button_X:
                numberFlag = 2;
                currOperator = operators.MUL;
                result.setText(no1 + enumToString(currOperator) + no2);
                break;
            case R.id.button_div:
                numberFlag = 2;
                currOperator = operators.DIV;
                result.setText(no1 + enumToString(currOperator) + no2);
                break;
            case R.id.button_equals:
                if(currOperator!=operators.NOSTATE){
                    switch (currOperator){
                        case DIV:
                            result.setText(String.valueOf(Integer.parseInt(no1) / Integer.parseInt(no2)));
                            break;
                        case MIN:
                            result.setText(String.valueOf(Integer.parseInt(no1) - Integer.parseInt(no2)));
                            break;
                        case MUL:
                            result.setText(String.valueOf(Integer.parseInt(no1) * Integer.parseInt(no2)));
                            break;
                        case PLUS:
                            result.setText(String.valueOf(Integer.parseInt(no1) + Integer.parseInt(no2)));

                    }
                    no1 = "";
                    no2 = "";
                    currOperator = operators.NOSTATE;
                    numberFlag = 1;
                }

        }

    }

    private String enumToString(operators currOperator) {
        String toReturn = "";
        switch (currOperator){
            case MUL: toReturn = " X ";
            break;
            case MIN: toReturn = " - ";
            break;
            case DIV: toReturn = " % ";
            break;
            case PLUS: toReturn = " + ";
            break;
            case NOSTATE:
        }
        return toReturn;
    }
}