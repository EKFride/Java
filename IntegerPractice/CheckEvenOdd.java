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
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckEvenOdd ck = new CheckEvenOdd();
        
        int number;
        System.out.print("Input Number: ");
        while (!sc.hasNextInt()) {            
            System.err.println("Only accepts integer number. Please retype.");
            System.out.print("Input Number: ");
            sc.next();
        }
        number = sc.nextInt();
        
        if(ck.checkEvenOddNumber(number)){System.out.println("1");}
        else {System.out.println("0");}
    }
    
    public boolean checkEvenOddNumber(int number){
        if(number % 2 == 0 || number == 0){return true;}
        else {return false;}
    }
}
