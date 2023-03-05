// Check Whether Given Number is Divisible by 5
import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("Number is not divisible by 5");
        }
    }
    
}
