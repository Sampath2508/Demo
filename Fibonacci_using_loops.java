import java.util.Scanner;

class Fibonacci_using_loops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 1;
        System.out.print("Enter Number : ");
        int num = input.nextInt();

        System.out.println("\nUsing For Loop : ");

        for(int i = 0; i <= num; i++){
            if (i <= 1) System.out.print(i + " ");
            else{
                int temp = num1 + num2;
                num1 = num2;
                num2 = temp;
                System.out.print(temp + " ");
            }
        }

        System.out.println("\nUsing while Loop : ");

        int i = 0;
        num1 = 0;num2 = 1;
        while(i <= num){
            if (i <= 1) System.out.print(i + " ");
            else{
                int temp = num1 + num2;
                num1 = num2;
                num2 = temp;
                System.out.print(temp + " ");
            }
            i++;
        }

        System.out.println("\nUsing do-while Loop : ");

        i = 0;
        num1 = 0;num2 = 1;
        do{
            if (i <= 1) System.out.print(i + " ");
            else{
                int temp = num1 + num2;
                num1 = num2;
                num2 = temp;
                System.out.print(temp + " ");
            }
            i++;
        }while(i <= num);
    }
}