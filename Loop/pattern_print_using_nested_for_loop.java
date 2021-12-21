import java.util.Scanner;

class Solution {
    public static void main(String[] arg)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int num = input.nextInt();

    for(int i = 0; i < num; i++){
        for(int j = 0; j < num; j++){
            System.out.print(" ");
            if (j <= i) System.out.print("*");
        }
        System.out.print("\n");
    }
    }
}   
