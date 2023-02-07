// Find the Largest Number Among Three Numbers
import java.util.Scanner;
public class Solution_5 {
    public static void main(String[] args){
        System.out.println("Enter three Number to check the largest number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println(a + " is Largest Number");
        } 
        else if(b>a && b>c){
            System.out.println(b + " is Largest Number");
        }
        else{
            System.out.println(c + " is Largest Number");
        }
    }
}
