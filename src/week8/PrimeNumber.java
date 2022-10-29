package week8;

import java.util.Scanner;

public class PrimeNumber {
    public static void method1(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = input.nextInt();
        int count=0;

        if (num >1){
            for (int i = 1;i<=num;i++){
              if(num%i==0)
                  count++;
            }
            if (count==2){
                System.out.println("its prime number");

            }else {
                System.out.println("not a prime number");

            }
            System.out.println("not a prime number");


        }
    }

    public static void main(String[] args) {
        method1();
    }
}
