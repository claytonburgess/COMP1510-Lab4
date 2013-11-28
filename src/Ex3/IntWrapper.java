package Ex3;
/**
 * COMP 1510 Lab 04
 * Clayton Burgess
 * A00889398
 * Set 1A
 */

import java.util.Scanner;

public class IntWrapper {

    public static void main(String[] args) {
        int input;
        
        String stringOfInt;
        String stringOfInt2;
        int sum;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an integer number: ");
        input = scan.nextInt();
        
        System.out.println(input + " as a binary number is " + Integer.toBinaryString(input));
        System.out.println(input + " as a Octal number is " + Integer.toOctalString(input));
        System.out.println(input + " as a hexadecimal number is " + Integer.toHexString(input));
        
        System.out.println();
        System.out.println("Integers can range from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();
        
        System.out.print("Please enter another integer number: ");
        stringOfInt = scan.next();
        System.out.print("One more integer please! ");
        stringOfInt2 = scan.next();
        
        sum = Integer.parseInt(stringOfInt) + Integer.parseInt(stringOfInt2);
        
        System.out.println("\nThe sum of " + stringOfInt + " + " + stringOfInt2 + " is " + sum);
        
        scan.close();

    }

}
