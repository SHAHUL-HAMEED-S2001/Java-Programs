// Check if a Given Integer is Odd or Even

import java.util.Scanner;

public class Solution_2{
    public static void main(String[] args){
        System.out.println("Enter a number to check is even or not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
}