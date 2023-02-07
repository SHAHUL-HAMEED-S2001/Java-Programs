// Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args){
        System.out.println("Enter a number to is Positive: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>0){
            System.out.println(n + "Is Positive");
        }else{
            System.out.println(n + "Is Negative");
        }
    }
}
