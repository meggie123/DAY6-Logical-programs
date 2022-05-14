package com.bridgelabz.LogicalPrograms;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int remainder , reversedNumber = 0;
        System.out.println("Enter a Number to be Reversed:");
        int numberToBeReverse = sc.nextInt();
        sc.close();

        while (numberToBeReverse > 0){

            remainder = numberToBeReverse % 10;
            reversedNumber = ((reversedNumber * 10) + remainder);
            numberToBeReverse = numberToBeReverse / 10;
        }
        System.out.println("The Reversed Number is :" + reversedNumber);
    }
}
