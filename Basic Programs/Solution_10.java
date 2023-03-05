// Sum of Digits of a Number using Recursion
import java.util.Scanner;

public class Solution_10 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Sum of Digits: "+ sumOfDigit(num));
    }

    static int sumOfDigit(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + sumOfDigit(num/10);
    }
}
