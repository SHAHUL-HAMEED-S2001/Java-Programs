// Accept two Integers and Check if they are Equal.
import java.util.Scanner;

public class Solution_8 {
    public static void main(String[] args) {
        System.out.println("Enter First  Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println("The Entered Numbers are Equal");
        } else {
            System.out.println("The Entered Numbers are Not Equal");
        }
    }
    
}
