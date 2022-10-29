package week8;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void method1(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num =obj.nextInt();
        System.out.println("given number is :" +num);
        int temp =num;
        int sum =0;
        int r = 0;

        while (num>0){
            r= num % 10;
            num =num /10;
            sum = sum + (r*r*r);

        }
if (temp ==sum) {
    System.out.println("this is an armstrong number:");
}else{
    System.out.println("this not a armstrong number");
}

    }

    public static void main(String[] args) {
        method1();
    }
}
