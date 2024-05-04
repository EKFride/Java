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
public class CheckIntegerNumber {
    public static void main(String[] args) {
        CheckIntegerNumber ck = new CheckIntegerNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number;
        while (!sc.hasNextInt()) {     
            System.err.println("Please enter integer number.");
            System.out.print("Enter number: ");
            sc.next();
        }
        number = sc.nextInt();
        int newnum= ck.reverseIntNum(number);
        System.out.println("The number after reverse: "+ newnum);
        
        if(number <= 0) {
            System.out.println("Prime number is not defined for negative numbers or zero.");
        }
        
        if(ck.checkPrime(newnum)) { 
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    
    /**
     * To use reverse integer number.
     * @return 
     */
    int reverseIntNum (int num) {
        int absNum = Math.abs(num);
        int str = Integer.parseInt( new StringBuilder(Integer.toString(absNum)).reverse().toString());
        if(num < 0 ){
            str = str*(-1);
        }
        return str;
    }

    /**
    * To use check prime number
    * @return 
    */
    boolean checkPrime(int number) {
        if (number == 1) return false;
        for(int i=2 ; i < number ; i++){
            if(number%i==0) 
                return false;
        }
        return true;
    }
}
