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
public class SetUpTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        while(!sc.hasNextInt()){
            System.err.println("Let enter a number integer. Retype.");
            System.out.print("Input: ");
            sc.next();
        }
        int input = sc.nextInt();
        int days = input / (24 * 3600);
        input = input % (24 * 3600);
        int hours = input / 3600;
        input %= 3600;
        int minutes = input / 60;
        input %= 60;
        int seconds = input;
        System.out.printf("Time : %d days %2d hours %2d minutes %2d seconds\n" ,days , hours, minutes, seconds);
    }
}
