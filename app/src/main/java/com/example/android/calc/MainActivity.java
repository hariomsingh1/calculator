package com.example.android.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    boolean op =false;
    char operator;
    float res;
   private String f="",s="",h="";
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }






//----------EQUALS----------------------
    public void equal(View view) {
    float first=Float.parseFloat(f);
    float second =Float.parseFloat(s);




    switch(operator)
    {
        case '+' : res=first+second;
        op=false;
        f="";
        dis(Float.toString(res));
        break;
        case '-' : res=first-second;
            op=false;
            f="";
            dis(Float.toString(res));
            break;
        case '/' : res=first/second;
            op=false;
            f="";
            dis(Float.toString(res));
            break;
        case 'x' : res=first*second;
            op=false;
            f="";
            dis(Float.toString(res));
            break;


    }

    f=""+res;
    s="";


}
//---------------DISPLAY---------------------------------
    public void dis(String e) {
        if(!op) {
            textview = findViewById(R.id.textView);
            f = f + e;

            textview.setText(f);
        }
        else
        {
            textview = findViewById(R.id.textView);
            s = s + e;

            textview.setText(s);

        }

    }
    //--------OPERATOR SET AND DISPLAY---------
    void opr(char c)
    {
        op=true;

        textview = findViewById(R.id.textView);

        textview.setText(f+c);
        operator=c;
    }
    //---------VALUES---------
    public void zero(View view) {
        dis("0");
    }
    public void one(View view) {
        dis("1");
    }
    public void two(View view) {
        dis("2");
    }
    public void three(View view) {
        dis("3");
    }
    public void four(View view) {
        dis("4");
    }
    public void five(View view) {
        dis("5");
    }
    public void six(View view) {
        dis("6");
    }
    public void seven(View view) {
        dis("7");
    }
    public void eight(View view) {
        dis("8");
    }
    public void nine(View view) {
        dis("9");
    }
    public void point(View view) {
        dis(".");
    }
   // ------------OPERATOR-----------
   public void plus(View view) {
       opr('+');

   }
    public void minus(View view) {
        opr('-');

    }
    public void multi(View view) {
        opr('x');

    }
    public void divide(View view) {
        opr('/');

    }
    //----------RESET-------
    public void reset(View view) {

        f="";
        s="";
        op=false;
        operator='+';
        textview = findViewById(R.id.textView);

        textview.setText("0");
        h="";
        TextView textview1 = findViewById(R.id.textView2);

        textview1.setText("0");

    }
    //--------------BACKSPACE---------
    public void back(View view)
    {
        if(!op) {
            if(f.length()>0 )
            f=f.substring(0, f.length() - 1);
            dis("");
        }
        else
        {
            if(s.length()>0 )
            s=    s.substring(0, s.length() - 1);
            dis("");
        }
    }
    //----------HISTORY---------------


}