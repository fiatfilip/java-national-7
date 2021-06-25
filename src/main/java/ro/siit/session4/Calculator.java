package ro.siit.session4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input operation");
        String op = keyboard.nextLine();
        double op1, op2, result = 0.0;

        switch (op){
            case "+":
                op1 = getOperand(keyboard, "First operand?");
                op2 = getOperand(keyboard, "Second operand?");
                result = sum(op1,op2);
                break;
            case "-":
                op1 = getOperand(keyboard, "First operand?");
                op2 = getOperand(keyboard, "Second operand?");
                result =substract(op1,op2);
                break;
            case "/":
                op1 = getOperand(keyboard, "First operand?");
                op2 = getNonZeroOperand(keyboard, "Second operand?");
                result =divide(op1,op2);
                break;
            case "*":
                op1 = getOperand(keyboard, "First operand?");
                op2 = getOperand(keyboard, "Second operand?");
                result = multiply(op1,op2);
                break;
            case "%":
                op1 = getOperand(keyboard, "First operand?");
                op2 = getOperand(keyboard, "Second operand?");
                result = modulo(op1,op2);
                break;
            case "!":
                op1 = getOperand(keyboard, "Operand?");
                result = factorialRecursiv(op1);
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println(result);

    }

    public static double getOperand(Scanner keyboard, String info) {
        System.out.println(info);
        return Double.parseDouble(keyboard.nextLine());
    }

    private static double getNonZeroOperand(Scanner keyboard, String info){
        double operand;
        do{
            operand = getOperand(keyboard, info);

        }while(operand == 0);

        return operand;
    }

    private static double sum(double a, double b){
        return a + b;
    }

    private static double substract(double a, double b){
        return a - b;
    }

    private static double modulo(double a, double b){
        return a % b;
    }

    private static double multiply(double a, double b){
        return a * b;
    }

    private static double divide(double a, double b){
        return a / b;
    }

    private static double factorial(double a){
        double f = 1;
        for (int i = 2; i <= a; i++) {
            f = f*i;
            //f*=i;
        }
        return f;
    }

    private static double factorialRecursiv(double n){
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursiv(n-1);
    }
}
