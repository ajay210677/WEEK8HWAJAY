package week8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleNested8 {

    public static void method (int n){

        for (int i = 0;i< n; i ++){
            for (int j = 0; j<i;j++){
                System.out.print("0");
            }
        }


    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int n = obj.nextInt();
        method(n);
    }
}



