package week8;

import java.util.Scanner;

public class MinAndMaxInputChallange {
    public static void method1(int[]a){
        int max =0;
        int min=0;
        int i = 0;  //Method for finding max and min number
        while (i<a.length) {
            if (i == 0);
            max = min =a[i];
             if (a[i]>max) {
                max = a[i];
                 if (a[i]<min ){
                     min = a[i];
                     i++;

                 }
                 System.out.println("this is max number:"+max);
                 System.out.println("this is min number:"+min);
            }


        }

    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter size of aray");
        int sizeOfArray = obj.nextInt();
        if (sizeOfArray<0);
        System.out.println("invalid number");

            int a[]=new int [sizeOfArray];
            int i = 0;
            while (i<a.length) {
                System.out.println("please enter number"+(i + 1)+":");
                a[i]=obj.nextInt();
                i++;}
            method1(a);
            }
    }

