package week8;
import java.util.Scanner;

public class VowelConsonant3 {

    public void method1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = obj.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "is a vowel");
        } else if (ch > 'a' && ch < 'z') {
            System.out.println(ch+"is a consonant");

        }else{
            System.out.println("it invaild data");
        }

    }

    public static void main(String[] args) {
        VowelConsonant3 obj1 =new VowelConsonant3();
        obj1.method1();
    }
}
