package org.example;
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        char action = args[2].charAt(0);
        int result;
        switch (action){
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
                break;
            default:
                System.out.println("wrong symbol");
        }

    }

}