package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editA, editB;
    RadioButton rdCong, rdTru, rdNhan, rdChia;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAC, btnBang, btnExit;
    TextView txtResult;
    boolean flag = false;
    String a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a="";
        b="";
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        editA = (EditText) findViewById(R.id.editA);
        editB = (EditText) findViewById(R.id.editB);
        rdCong = (RadioButton) findViewById(R.id.rdCong);
        rdTru = (RadioButton) findViewById(R.id.rdTru);
        rdNhan = (RadioButton) findViewById(R.id.rdNhan);
        rdChia = (RadioButton) findViewById(R.id.rdChia);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnBang = (Button) findViewById(R.id.btnBang);
        btnExit = (Button) findViewById(R.id.btnExit);

        editA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
            }
        });

        editA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = true;
                }
            }
        });

        editB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
            }
        });

        editB.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    flag = false;
                }
            }
        });
        }


        public void so1(View v)
        {
                if (flag) {
                    a += btn1.getText().toString();
                    editA.setText(a);
                } else {
                    b += btn1.getText().toString();
                    editB.setText(b);
                }
        }
        public void so2(View v)
        {
            if (flag) {
                a += btn2.getText().toString();
                editA.setText(a);
            } else {
                b += btn2.getText().toString();
                editB.setText(b);
            }
        }
        public void so3(View v)
        {
            if (flag) {
                a += btn3.getText().toString();
                editA.setText(a);
            } else {
                b += btn3.getText().toString();
                editB.setText(b);
            }
        }
        public void so4(View v)
        {
            if (flag) {
                a += btn4.getText().toString();
                editA.setText(a);
            } else {
                b += btn4.getText().toString();
                editB.setText(b);
            }
        }
        public void so5(View v)
        {
            if (flag) {
                a += btn5.getText().toString();
                editA.setText(a);
            } else {
                b += btn5.getText().toString();
                editB.setText(b);
            }
        }
        public void so6(View v)
        {
            if (flag) {
                a += btn6.getText().toString();
                editA.setText(a);
            } else {
                b += btn6.getText().toString();
                editB.setText(b);
            }
        }
        public void so7(View v)
        {
            if (flag) {
                a += btn7.getText().toString();
                editA.setText(a);
            } else {
                b += btn7.getText().toString();
                editB.setText(b);
            }
        }
        public void so8(View v)
        {
            if (flag) {
                a += btn8.getText().toString();
                editA.setText(a);
            } else {
                b += btn8.getText().toString();
                editB.setText(b);
            }
        }
        public void so9(View v)
        {
            if (flag) {
                a += btn9.getText().toString();
                editA.setText(a);
            } else {
                b += btn9.getText().toString();
                editB.setText(b);
            }
        }
        public void so0(View v)
        {
            if (flag) {
                a += btn0.getText().toString();
                a = KT_Input(a);
                editA.setText(a);
            } else {
                b += btn0.getText().toString();
                b = KT_Input(b);
                editB.setText(b);
            }
        }

        public String KT_Input(String s)
        {
           if(s.indexOf("0") == 0)
           {
               s = "";
               return s;
           }
            return s;
        }

    public void Exit(View v) {
        System.exit(0);
    }

    public void Cal(View v) {
        Double a = Double.parseDouble(editA.getText().toString());
        Double b = Double.parseDouble(editB.getText().toString());
        Double s;
        if (rdCong.isChecked() == true)
            s = a + b;
        else if (rdTru.isChecked() == true)
            s = a - b;
        else if (rdNhan.isChecked() == true)
            s = a * b;
        else
            s = a / b;

        txtResult.setText(String.valueOf(s));
    }

    public void Reset(View v)
    {
        a = "";
        b = "";
        editA.setText(a);
        editB.setText(b);
    }
}