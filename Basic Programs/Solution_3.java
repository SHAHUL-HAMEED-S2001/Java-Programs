// Calculate the Sum of Odd & Even Numbers

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args){
        System.out.println("Enter the upper limit: ");
        Scanner sc = new Scanner(System.in);
        int upperLimit = sc.nextInt();
        System.out.println("Enter the lower limit: ");
        int lowerLimit = sc.nextInt();
        sc.close();
        int oddSum = 0;
        int evenSum = 0;

        for(int i = lowerLimit; i <= upperLimit; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Sum of Even Numbers: " + evenSum);
    }
}
