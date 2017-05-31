package com.example.gideonubaldo.fullcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button addbtn,minusbtn,dividebtn,multiplybtn,equalbtn,percentbtn,plusandminusbtn,acbutton,zerobtn,onebtn,twobtn,
    threebtn,fourbtn,fivebtn,sixbtn,sevenbtn,eightbtn,ninebtn,dotbtn;
    TextView output;
    double var1,var2;
    boolean add,minus,mult,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        //button binding
        addbtn = (Button)findViewById(R.id.addbutton);
        minusbtn = (Button)findViewById(R.id.minusbutton);
        dividebtn = (Button)findViewById(R.id.divisionbutton);
        multiplybtn = (Button)findViewById(R.id.multiplicationbutton);
        equalbtn = (Button)findViewById(R.id.equalbutton);
        percentbtn = (Button)findViewById(R.id.percentagebutton);
        plusandminusbtn = (Button)findViewById(R.id.plusandminusbutton);
        acbutton = (Button)findViewById(R.id.acbutton);
        zerobtn = (Button)findViewById(R.id.zerobutton);
        onebtn = (Button)findViewById(R.id.onebutton);
        twobtn = (Button)findViewById(R.id.twobutton);
        threebtn = (Button)findViewById(R.id.threebutton);
        fourbtn = (Button)findViewById(R.id.fourbutton);
        fivebtn = (Button)findViewById(R.id.fivebutton);
        sixbtn = (Button)findViewById(R.id.sixbutton);
        sevenbtn = (Button)findViewById(R.id.sevenbutton);
        eightbtn = (Button)findViewById(R.id.eightbutton);
        ninebtn = (Button)findViewById(R.id.ninebutton);
        dotbtn = (Button)findViewById(R.id.dotbutton);
        output = (TextView)findViewById(R.id.output);


        acbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(null);
            }
        });

        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "0");
            }
        });
        onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "1");
            }
        });
        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "2");
            }
        });
        threebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "3");
            }
        });
        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "4");
            }
        });
        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "5");
            }
        });
        sixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "6");
            }
        });
        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "7");
            }
        });
        eightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "8");
            }
        });
        ninebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "9");
            }
        });
        dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + ".");
            }
        });
        percentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = (Double.parseDouble(output.getText() + ""));
                output.setText((var1/100.0) + "");
            }
        });

        plusandminusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String var1 = output.getText().toString();
                StringBuilder sb = new StringBuilder(var1);
                if(sb.)
                    output.setText("-" + output.getText());
                else

                    //output.setText(var1.replace('-', null));
            }
        });

        //---------------------------------------------//
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(output.getText()+ "");
                add =true;
                output.setText(null);
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(output.getText()+ "");
                minus =true;
                output.setText(null);
            }
        });
        multiplybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(output.getText()+ "");
                mult =true;
                output.setText(null);
            }
        });
        dividebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(output.getText()+ "");
                div =true;
                output.setText(null);
            }
        });
        equalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(output.getText()+ "");
                if(add){
                    output.setText(var1 + var2 + "");
                    add = false;
                }
                if(minus){
                    output.setText(var1 - var2 + "");
                    minus = false;
                }
                if(mult){
                    output.setText(var1 * var2 + "");
                    mult = false;
                }
                if(div){
                    output.setText(var1 / var2 + "");
                    div = false;
                }
            }
        });
    }

}
