/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);

        int sub = a - b;
        System.out.println("The subtraction is: " + sub);

        int multiply = a * b;
        System.out.println("The multiplication is: " + multiply);

        
            int div = a / b;
            System.out.println("The division is: " + div);
        

        sc.close();
    }
}
