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
public class SumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumElement se = new SumElement();
        //Input
        int inputInt;
        System.out.print("Input Integer: ");
        while (!sc.hasNextInt()) {            
            System.err.println("Please enter a integer number.");
            System.out.print("Input Integer: ");
            sc.next();
        }
        inputInt = sc.nextInt();

        //Ouput
        int outputIntSum = se.sumElementInt(inputInt);
        System.out.println("Sum: "+outputIntSum);
        int outputIntMul = se.multiElementInt(inputInt);
        System.out.println("Multiple: "+ outputIntMul);
    }
    
    public int sumElementInt(int input){
        int sum = 0;
        while(input != 0){
            sum = sum + (input%10);
            input = input/10;
        }
        return sum;
    }
    
    public int multiElementInt(int input){
        int multi = 1;
        while(input != 0 ){
            multi = multi*(input%10);
            input = input/10;
        }
        return multi;
    }
}
