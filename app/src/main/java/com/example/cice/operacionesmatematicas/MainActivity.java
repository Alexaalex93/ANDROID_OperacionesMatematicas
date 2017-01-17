package com.example.cice.operacionesmatematicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varx = (EditText) findViewById(R.id.varx);
    EditText vary = (EditText) findViewById(R.id.vary);
    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView resultado = (TextView) findViewById(R.id.resultado);



        Button sum = (Button) findViewById(R.id.sumbutton);
        Button res = (Button) findViewById(R.id.restbutton);
        Button mul = (Button) findViewById(R.id.multbutton);
        Button div = (Button) findViewById(R.id.divbutton);
        Button rest = (Button) findViewById(R.id.resetbutton);

        Button cal = (Button) findViewById(R.id.calcbutton);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = calcular(0);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result =  calcular(1);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result =calcular(2);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result =calcular(3);
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = calcular(4);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(Integer.toString(result));

            }
        });
    }

        int calcular(int i) {
            int a = 0;
            switch (i) {
                case 0:
                    a = Integer.parseInt(varx.getText().toString()) + Integer.parseInt(vary.getText().toString());
                    break;
                case 1:
                    a = Integer.parseInt(varx.getText().toString()) - Integer.parseInt(vary.getText().toString());
                    break;
                case 2:
                    a = Integer.parseInt(varx.getText().toString()) * Integer.parseInt(vary.getText().toString());
                    break;
                case 3:
                    a = Integer.parseInt(varx.getText().toString()) / Integer.parseInt(vary.getText().toString());
                    break;
                case 4:
                    a = 0;
                    varx.setText(0);
                    vary.setText(0);

                    break;

          }
            return a;
        }

}


