// Check if a Given Integer is Odd or Even

import java.util.Scanner;

public class Solution_2 {
    public static final void main(String[] args){

        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("Is Even");
        }else{
            System.out.println("Is Odd");
        }
    }
}