// Find the Biggest of 3 Numbers

import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args){
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();
        sc.close();

        if(x>y && x>z) {
            System.out.println(x + " is Largest");
        }
        else if(y>x && y>z) {
            System.out.println(y + " is Largest");
        }
        else {
            System.out.println(z + " is Largest");
        }
    }
}
