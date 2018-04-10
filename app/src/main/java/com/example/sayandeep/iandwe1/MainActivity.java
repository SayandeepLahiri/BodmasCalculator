package com.example.sayandeep.iandwe1;
/**Assumptions: 1)Square root and Cube root of a single number only not in multinomial expression form.
 * 2)Expression Doesn't start with a negative number.
 * 3)Percentage of two numbers separately not in multinomial expression form.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button0, buttonClear, buttonAdd, buttonSub,
            buttonMulti, buttonDiv, buttonEquals, buttonlpar,
            buttonrpar, buttonsqRoot, buttonCubeRoot, buttonPercentage, buttonExp, buttonDecimal, buttonExit;
    EditText etInput;
    String exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMulti = findViewById(R.id.buttonMultiplication);
        buttonDiv = findViewById(R.id.buttonDivision);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEquals = findViewById(R.id.buttonEquals);
        etInput = findViewById(R.id.etInput);
        buttonlpar = findViewById(R.id.buttonopenbracket);
        buttonrpar = findViewById(R.id.buttonclosebracket);
        buttonExp = findViewById(R.id.buttonpower);
        buttonCubeRoot = findViewById(R.id.buttoncuroot);
        buttonsqRoot = findViewById(R.id.buttonsqroot);
        buttonPercentage = findViewById(R.id.buttonpercent);
        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonExit=findViewById(R.id.buttonExit);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + "9");
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput == null)
                    etInput.setText(".");
                else
                    etInput.setText(etInput.getText() + ".");
            }
        });
        buttonlpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + " ( ");
            }
        });
        buttonrpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + " ) ");
            }
        });
        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText() + " ^ ");
            }
        });
        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.setText(etInput.getText()+" % ");

            }
        });
        buttonCubeRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cube Root",LENGTH_SHORT).show();
                try {
                    float num = Float.parseFloat(etInput.getText().toString());
                    float res = (float) Math.cbrt(num);
                    etInput.setText(res + "");
                } catch (Exception e) {
                    etInput.setText("invalid");
                }
            }
        });
        buttonsqRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Square Root",LENGTH_SHORT).show();
                try {
                    float num = Float.parseFloat(etInput.getText().toString());
                    float res = (float) Math.sqrt(num);
                    etInput.setText(res + "");
                } catch (Exception e) {
                    etInput.setText("invalid");
                }
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput == null)
                    etInput.setText("");
                else
                    etInput.setText(etInput.getText() + " + ");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput == null)
                    etInput.setText("");
                else
                    etInput.setText(etInput.getText() + " - ");
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput == null)
                    etInput.setText("");
                else

                    etInput.setText(etInput.getText() + " * ");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput == null)
                    etInput.setText("");
                else
                    etInput.setText(etInput.getText() + " / ");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                exp = etInput.getText().toString();
                int i=0;
                 i=exp.indexOf('%');
                String exp1=exp;
                if(i!=-1)
                {   float n1=Float.parseFloat(exp1.substring(0,i-1));
                    float n2=Float.parseFloat(exp1.substring(i+2,exp1.length()));
                    float res=(n1/100)*n2;
                    etInput.setText(res+"");
                }
                else{
                Arithmetic arithmetic = new Arithmetic();
                if (arithmetic.evaluate(exp) != -1)
                    etInput.setText(arithmetic.evaluate(exp) + "");
                else etInput.setText("invalid");}


            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = etInput.getText().toString();
                if (s1.length() > 0)
                    etInput.setText(s1.substring(0, s1.length() - 1));

                Toast.makeText(getApplicationContext(), "Long Press for Clearing all the content.",
                        LENGTH_SHORT).show();

            }
        });
        buttonClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                etInput.setText("");
                return true;
            }
        });
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });


    }

}
