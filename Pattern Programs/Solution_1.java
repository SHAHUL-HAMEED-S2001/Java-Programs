/*
   *
  ***
 *****
*******
*/

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        System.out.println("Enter a Rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * rows - 1; j++) {
                if (j >= rows - (i - 1) && j <= rows + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
