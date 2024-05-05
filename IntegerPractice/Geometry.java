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
public class Geometry {
    public static void main(String[] args) {
        boolean menuContinue = true;
        do {
            System.out.println("[1] Square.");
            System.out.println("[2] Rectangle.");
            System.out.println("[3] Triangle.");
            System.out.println("[4] Out.");
            int choice = input("Enter your choice: ");
            boolean menuContinueSq = true;
            boolean menuContinueRe = true;   
            switch (choice){
                case 1:
                    do{
                        System.out.println("[1] Square.");
                        System.out.println("[2] SpuareFull.");
                        System.out.println("[3] Back.");
                        int choiceSq = input("Enter your choice: ");
                        switch(choiceSq){
                            case 1:
                                printSquare();
                                break;
                            case 2:
                                printSpuareFull();
                                break;
                            case 3:
                                menuContinueSq = false;
                                break;
                            default:
                                System.err.println("Please just choice from [1] to [3]");
                                break;
                        }
                    }while (menuContinueSq);
                    break;
                case 2:
                    do{
                        System.out.println("[1] Rentangle.");
                        System.out.println("[2] RentangleFull.");
                        System.out.println("[3] Back");
                        int choiceRe = input("Enter your choice: ");
                        switch (choiceRe){
                            case 1:
                                printRectangle();
                                break;
                            case 2:
                                printRectangleFull();
                                break;
                            case 3:
                                menuContinueRe = false;
                                break;
                            default:
                                System.err.println("Please just choice from [1] to [3]");
                                break;
                        }
                    }while (menuContinueRe);
                    break;
                case 3:
                    printTriangle();
                    break;
                case 4:
                    System.out.println("GOOD LUCK - GOOD BYE");
                    menuContinue = false;
                    break;
                default:
                    System.err.println("Please just choice from [1] to [4]");
                    break;
            }
        } while(menuContinue);
    }
    
    public static int input (String mgs){
        Scanner sc = new Scanner(System.in);
        System.out.print(mgs);
        while(!sc.hasNextInt()){
            System.err.println("Please enter a number integer.");
            System.out.print(mgs);
            sc.next();
        }
        int input = sc.nextInt();
        return input;
    }
    
    public static int printRectangleFull(){
        int length = input("Length is: ");
        int width = input("Width is: ");
        if(length <= 0 || width<=0){
            System.err.println("Length and Width of Rectangle is positive number.");
        }else{
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        return 0;
    }
    
    public static int printRectangle(){
        int length = input("Length is: ");
        int width = input("Width is: ");
        if(length <= 0 || width <= 0){
            System.err.println("Length and Width of Rectangle must be positive number.");
        }else {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++) {
                    if (i == 0 || i == width - 1 || j == 0 || j == length - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        return 0;
    }
    
    public static boolean isTriangle(int edge1, int edge2, int edge3) {
        return edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1;
    }
    
    public static boolean isRightTriangle(int edge1, int edge2, int edge3){
        return ((edge1*edge1)+(edge2*edge2)==(edge3*edge3)) || ((edge2*edge2)+(edge3*edge3)==(edge1*edge1)) || ((edge1*edge1)+(edge3*edge3)==(edge2*edge2));
    }
    
    public static int printTriangle(){
        int edge1 = input("The first edge is: ");
        int edge2 = input("The second edge is: ");
        int edge3 = input("The third edge is:");
        if(edge1 <= 0 || edge2 <= 0 || edge3 <= 0){
            System.err.println("Three edge must be a positive number.");
        }else{
            if(!isTriangle(edge1, edge2, edge3)){
                System.err.println(" Three edge can not create a Triangle.");
            }else{
                if (edge1 == edge2 && edge2 == edge3) {
                    printEquilateralTriangle(edge1);
                } 
                else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
                    printIsoscelesTriangle(Math.max(Math.max(edge1, edge2), edge3));
                } 
                else if(isRightTriangle(edge1, edge2, edge3)){
                    printRightTriangle(Math.max(Math.max(edge1, edge2), edge3));
                } else{
                    System.out.println("That's a triangles usually. Can not to draw.");
                }
            }
        }
        return 0;
    }
    
    public static int printIsoscelesTriangle(int height){
        System.out.println("Isosceles triangle:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    
    public static int printEquilateralTriangle(int height){
        System.out.println("Equilateral triangle:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    
    public static int printRightTriangle(int height){
        System.out.println("Right triangle:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    
    public static int printSquare(){
        int size = input("Size of Square is: ");
        if(size <= 0){
            System.err.println("Size of Square must be a positive number.");
        }else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        return 0;
    }
    
    public static int printSpuareFull(){
        int size = input("Size of Square is: ");
        if(size <= 0){
            System.err.println("Size of Square must be a positive number.");
        }else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                        System.out.print("*"); 
                    }
                System.out.println();
                }
        }
        return 0;
    }
}
