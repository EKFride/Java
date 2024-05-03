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
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciNumber fi = new FibonacciNumber();
        
        int number;
        System.out.print("Input: ");
        while(!sc.hasNextInt()){
            System.err.println("Please enter a integer number.");
            System.out.print("Input: ");
            sc.next();
        }
        number = sc.nextInt();
        
        int result = fi.fibonacciNum(number);
        System.out.println("Fibonacci number of " + number + " is: " + result);
    }
    /**
    The Fibonacci sequence is an infinite sequence of natural numbers starting with 1 and 1, 
    then subsequent numbers will be equal to the sum of the two preceding numbers. 
    Ex: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ...
    */
    public int fibonacciNum( int number){
        if(number <= 1) return number;
        int fibPrev= 0 ;
        int fibCurr = 1;
        int fibNext = 0;
        for(int i = 2 ; i <= number ; i++){
            fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
            System.out.println("Fibonacci number of "+ i + " :" + fibNext);
        }
        return fibNext;
    }
}
