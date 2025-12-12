package com.example.android.layout_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView resultTextView;
    private double firstOperand = 0;
    private double secondOperand = 0;
    private String operator = "";
    private boolean isNewOperation = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 正确绑定 EditText
        inputEditText = findViewById(R.id.etDisplay);

        // 如果需要结果显示区域，添加 TextView
        resultTextView = findViewById(R.id.result);

        // 绑定按钮
        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button buttonDot = findViewById(R.id.btnDot);
        Button buttonPlus = findViewById(R.id.btnPlus);
        Button buttonMultiply = findViewById(R.id.btnMultiply);
        Button buttonMinus = findViewById(R.id.btnMinus);
        Button buttonDivide = findViewById(R.id.btnDivide);
        Button buttonEqual = findViewById(R.id.btnEqual);

        // 设置点击事件
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperation) {
                    inputEditText.setText("0");
                    isNewOperation = false;
                } else {
                    inputEditText.setText(inputEditText.getText() + "0");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNewOperation) {
                    inputEditText.setText("1");
                    isNewOperation = false;
                } else {
                    inputEditText.setText(inputEditText.getText() + "1");
                }
            }
        });

        // 其他数字按钮类似处理...

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("-");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("/");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void setOperator(String op) {
        if (!isNewOperation) {
            secondOperand = Double.parseDouble(inputEditText.getText().toString());
            calculate();
        } else {
            operator = op;
        }
        isNewOperation = true;
    }

    private void calculate() {
        firstOperand = Double.parseDouble(inputEditText.getText().toString());
        switch (operator) {
            case "+":
                secondOperand = firstOperand + secondOperand;
                break;
            case "-":
                secondOperand = firstOperand - secondOperand;
                break;
            case "*":
                secondOperand = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    secondOperand = firstOperand / secondOperand;
                } else {
                    resultTextView.setText("Error");
                    return;
                }
                break;
        }
        resultTextView.setText(String.valueOf(secondOperand));
        isNewOperation = true;
    }
}
