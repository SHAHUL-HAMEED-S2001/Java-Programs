// Sum of Digits
import java.util.Scanner;

public class Solution_9 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
