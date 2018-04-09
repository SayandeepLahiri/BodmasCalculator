package com.example.sayandeep.iandwe1;
import java.util.Stack;

/**
 * Created by Sayandeep on 09-04-2018.
 */

public class Arithmetic {

    char[] opss= { '(' , ')' , '^' , '%' , '*' , '/' , '+' , '-' };
    int[] precedence= {0,0,1,1,2,2,3,3};

    public boolean isOperator(char t)
    {
        int i;
        for(i=0; i< opss.length ; i++) {
            if (t == opss[i])
                return true;
        }
        return false;
    }

    float evaluate(String expression) {
        try {
            char[] tokens = expression.toCharArray();

            Stack<Float> values = new Stack<Float>();

            Stack<Character> ops = new Stack<Character>();

            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i] == ' ')
                    continue;

                if (!isOperator(tokens[i])) {
                    StringBuilder s = new StringBuilder();
                    while (i < tokens.length && tokens[i] != ' ' && !isOperator(tokens[i]))
                        s.append(tokens[i++]);
                    values.push(Float.parseFloat(s.toString()));
                } else if (tokens[i] == '(')
                    ops.push(tokens[i]);

                else if (tokens[i] == ')') {
                    while (ops.peek() != '(')
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    ops.pop();
                } else if (isOperator(tokens[i])) {
                    while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    ops.push(tokens[i]);
                }
            }
            while (!ops.empty())
                values.push(applyOp(ops.pop(), values.pop(), values.pop()));

            return values.pop();
        }catch (Exception ee){
            return -1;
        }
    }

    public boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        int op1p = getPrecedence(op1);
        int op2p = getPrecedence(op2);
        if (op2p > op1p)
            return false;
        else
            return true;
    }

    public float applyOp(char op, float b, float a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                return (float) Math.pow(a, b);
        }
        return 0;
    }

    public int getPrecedence(char c) {
        int i;
        for (i = 0; i < opss.length; i++) {
            if (c == opss[i])
                break;
        }
        return precedence[i];
    }
}