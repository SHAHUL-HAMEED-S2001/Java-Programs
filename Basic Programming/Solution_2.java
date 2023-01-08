// Check if a Given Integer is Odd or Even

import java.util.Scanner;

class Solution_1{
    public static void main(String[] args) {
        System.out.println("Java Program to Check if a Given Integer is Odd or Even");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();
        if (num%2==0)
            System.out.println("Is Even");
        else
            System.out.println("Is Odd");     
    }
}