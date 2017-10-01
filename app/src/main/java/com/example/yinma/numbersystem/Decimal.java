package com.example.yinma.numbersystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Decimal extends AppCompatActivity {
    long decnum=0;
    long octnum=0;
    long binnum=0;
    String hexa=null;

    String answerdecimal= String.valueOf(0);
    String answerbinary=null;
    String answeroctal=null;
    String answerhexa=null;

    EditText binobj;
    TextView decobj;
    TextView octobj=null;
    TextView hexaobj=null;

    Button clearbtnobj=null;
    EditText editTextobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);

        /******************************************************************************************/
        binobj = (EditText) findViewById(R.id.idbinary);
        decobj = (TextView) findViewById(R.id.iddecimal);
        octobj = (TextView)findViewById(R.id.idoctal);
        hexaobj = (TextView)findViewById(R.id.idhexa);
        clearbtnobj = (Button) findViewById(R.id.idclear);

        binobj.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                binobj.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        try
                        {
                            String binobjpro = binobj.getText().toString().trim();
                            if (binobjpro.isEmpty())
                            {
                                decobj.setText(null);
                                octobj.setText(null);
                                hexaobj.setText(null);
                            }
                            else
                            {
                                binnum = Long.parseLong(binobjpro);

                                answerdecimal = Long.toBinaryString(binnum);
                                decobj.setText(String.valueOf(answerdecimal));

                                answerhexa = Long.toHexString(binnum);
                                hexaobj.setText(answerhexa);

                                answeroctal = Long.toOctalString(binnum);
                                octobj.setText(answeroctal);
                            }
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }

                    }
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }
                });
            }
        });

        /***********************/
        clearbtnobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decnum=0;
                octnum=0;
                binnum=0;
                hexa = null;

                answerdecimal=null;
                answerbinary=null;
                answeroctal=null;
                answerhexa=null;
                decobj.setText(null);
                octobj.setText(null);
                hexaobj.setText(null);
                try {
                    binobj.getText().clear();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
