import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 1;
        System.out.print("Enter Number : ");
        int num = input.nextInt();

        for(int i = 0; i <= num; i++){
            if (i <= 1) System.out.print(i + " ");
            else{
                int temp = num1 + num2;
                num1 = num2;
                num2 = temp;
                System.out.print(temp + " ");
            }
        }
    }
}
