// Swapping two numbers

import java.util.Scanner;

public class Solution_6 {
    public static void main(String[] args) {
        System.out.println("Enter Value for A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Value for B: ");
        int b = sc.nextInt();
        sc.close();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap A: "+a+" B: "+b);
    }
    
}
