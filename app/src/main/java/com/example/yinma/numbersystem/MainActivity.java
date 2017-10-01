package com.example.yinma.numbersystem;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button gotobinobj;
    Button gotooctobj;
    Button gotodecobj;
   Button gotohexaobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotobinobj=(Button)findViewById(R.id.gotobinary);
       gotooctobj=(Button)findViewById(R.id.gotooctal);
        gotodecobj=(Button)findViewById(R.id.gotooctal);
       gotohexaobj=(Button)findViewById(R.id.gotohexadecimal);
    }
    public void binaryonclick(View v)
    {
        Intent ibinary = new Intent(this,BinaryActivity.class);
        startActivity(ibinary);
    }
    public void decimalonclick(View v)
    {
        Intent idecimal = new Intent(this,Decimal.class);
        startActivity(idecimal);
    }
    public void octalonclick(View v)
    {
        Intent ioctal = new Intent(this,Octal.class);
        startActivity(ioctal);
    }

    public  void hexadecimalonclick(View v)
    {
        Intent ihexadecimal = new Intent(this,Hexadecimal.class);
        startActivity(ihexadecimal);
    }
}
