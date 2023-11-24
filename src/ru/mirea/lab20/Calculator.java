package ru.mirea.lab20;
import java.util.Stack;
import static java.lang.Double.parseDouble;

public class Calculator {
    Stack<Double> operStack = new Stack<>();

    public double processing(String input){
        String[] operands = input.split(" ");

        for (String element: operands){
            if (isNumeric(element)){
                operStack.push(parseDouble(element));
            }
            else{
                double y = operStack.pop();
                double x = operStack.pop();
                switch (element){
                    case "+":
                        operStack.push(x + y);
                        break;
                    case "-":
                        operStack.push(x - y);
                        break;
                    case "*":
                        operStack.push(x * y);
                        break;
                    case "/":
                        operStack.push(x / y);
                        break;
                }
            }
        }
        return operStack.pop();
    }

    private boolean isNumeric(String element) {
        try {
            parseDouble(element);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
