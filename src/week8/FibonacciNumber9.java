package week8;

import java.util.Scanner;

public class FibonacciNumber9 {

    public void method1(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = obj .nextInt();
        System.out.println("Enter second number:");
        int n2 =obj.nextInt();
        System.out.println(n1 + ""+ n2);
        int sum;

        for (int i = 2; i < 11; i++){
            sum = n1 + n2;
            System.out.println(""+sum);
            n1=n2;
            n2=sum;
        }
    }

    public static void main(String[] args) {
        FibonacciNumber9 obj1 = new FibonacciNumber9();
        obj1.method1();
    }
}
