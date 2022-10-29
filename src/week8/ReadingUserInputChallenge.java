package week8;
//reading 10 number from console and print sum of those numbers
import java.util.Scanner;

public class ReadingUserInputChallenge {

    public boolean method1(){
        Scanner obj = new Scanner(System.in);
        int count =1;
        int sum = 0;
        while (count <=10){
            System.out.println("enter number #"+count);
            boolean number = obj.hasNext();
            if (number){
                int a = obj.nextInt();
                sum = sum + a;
                count ++;
            }else{
                System.out.println("invalid number");
            }
        }
        System.out.println("sumof all number="+sum);
        return false;

    }

    public static void main(String[] args) {
        ReadingUserInputChallenge obj1 = new ReadingUserInputChallenge();
        obj1.method1();
    }



}
