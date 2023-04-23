/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_1_javalab;

/**
 *
 * @author DELL
 */

import java.util.Scanner;
public class Exercise226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In the equation ax + b =0, enter a, b ");
        double a, b;
                
        do {
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();
        }while(a == 0);
        double x = -b / a;
        System.out.printf("The result: x = %.1f", x);
        sc.close();
    }
}
