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
public class FindPrimeAndSum {
    public static void main(String[] args) {
        //Input
        FindPrimeAndSum fi = new FindPrimeAndSum();
        int start = fi.inputInt("Input Start: ");
        int end = fi.inputInt("Input End: ");
        //Output
        int result = fi.findPrime(start, end);
        System.out.println("Abilities prime number between " + start+" and "+ end + " is: " + result);
        int sumPrime = fi.sumPrime(start, end);
        System.out.println("Sum prime number between "+ start +" and "+ end +" is: " + sumPrime);
    }

    public int findPrime (int start, int end){
        int count = 0;
        System.out.print("Prime number have: ");
        if(start < end){
            for (int i = start ; i <= end ; i++){
                if(isPrime(i)){
                    System.out.print(i + " ");
                    count += 1;
                }
            }
        } else {
            for (int i = start ; i >= end ; i--){
                if(isPrime(i)){
                    System.out.print(i + " ");
                    count += 1;
                }
            } 
        }
        System.out.println();
        return count;
    }
    
    public boolean isPrime (int num){
        if(num <= 1 ) return false;
        for (int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public int sumPrime(int start, int end){
        int sum=0;
        if (start < end){
            for(int i = start; i <= end ; i++){
                if(isPrime(i)){
                    sum += i;
                }
            }
        } else {
            for(int i = end; i <= start ; i++){
                if(isPrime(i)){
                    sum += i;
                }
            } 
        }
        return sum;
    }
    
    public int inputInt(String mgs){
        Scanner sc = new Scanner(System.in);
        System.out.print(mgs);
        while(!sc.hasNextInt()){
            System.err.println("Just accept integer number. Please retype.");
            System.out.print(mgs);
            sc.next();
        }
        int input = sc.nextInt();
        return input;
    }
}
