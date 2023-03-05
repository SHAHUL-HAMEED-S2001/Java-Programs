// Check if a Given Integer is Positive or Negative

import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num > 0){
            System.out.println(num + " is Positive");
        }
        else{
            System.out.println(num + " is Negative");
        }
    }
}
