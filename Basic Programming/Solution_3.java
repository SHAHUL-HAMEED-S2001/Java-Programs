// Calculate the Sum of Odd & Even Numbers in given array

import java.util.Scanner;

public class Solution_3{
    public static void main(String[] args){
        System.out.println("Enter a Upper Limit Number: ");
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        System.out.println("Enter a Lower Limit Number: ");
        int lower = sc.nextInt();
        sc.close();
        int EvenSum=0;
        int OddSum=0;

        for(int i=lower;i<=upper;i++){
            if(i%2==0){
                EvenSum=EvenSum+i;
            }
            else{
                OddSum=OddSum+i;
            }
        }
        System.out.println("Sum of Odd Numbers: "+OddSum);
        System.out.println("Sum of Even Numbers: "+EvenSum);
    }
}