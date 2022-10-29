package week8;

import java.util.Scanner;

public class TriangleNumber6 {

    public static void method1(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = obj.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        method1();
    }



}
