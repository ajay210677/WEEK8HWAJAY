package week8;

public class DigitSumChallenge4 {

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int reminder = number % 10;
                sum = sum + reminder;
                number = number / 10;
            }
            System.out.println("sum of the digit : " + sum);

        } else {
            sum=-1;
            System.out.println("invalid value:"+sum);
        }
return sum;

    }

    public static void main(String[] args) {
        DigitSumChallenge4 obj = new DigitSumChallenge4();
        obj .sumDigits(7);
        obj .sumDigits(1234);
        obj .sumDigits(8);



    }
}










