/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegerPractice;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FactorialNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        while (!sc.hasNextInt()) {            
            System.err.println("Just accepts integer number.");
            System.out.print("Enter number: ");
            sc.next();
        }
        number = sc.nextInt();
            
        if (number < 0) {
            System.err.println("Factorial number is not defined for negative numbers.");
            return;
        }
        if (number == 0 ){System.out.println("Factorial number of " + number + "! is: " + number);}
        else {
            long result=1;
            for(int i = 1 ; i <= number ; i++){
                result = result*i;
                // System.out.println("Result of " + i + "!: " + result); result of each i to number
            }
            System.out.println("Factorial number of " + number + "! is: " +result);
            
            /* --- When data bigger than value set of int, use long or BigInteger ----
            BigInteger result = BigInteger.ONE; // Initialize BigInteger with value 1
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i)); // Use method multiply to multi in BigIntegers
            }
            System.out.println("Factorial number of " + number + "! is: " + result);*/
        }
    }
}
