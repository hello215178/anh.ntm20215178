/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_1_javalab;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Second_degree_equation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c in the equation ax^2 + bx + c = 0 ");
        double a, b, c;
        do {
            System.out.print("a = ");
            a = sc.nextDouble();
            System.out.print("b = ");
            b = sc.nextDouble();
            System.out.print("c = ");
            c = sc.nextDouble();
        }while(a == 0);
        double D = b*b-4*a*c;
        if (D<0) System.out.println("The equation has no root");
        else {
            if (D == 0) System.out.printf("The equation has 2 similar root x1 = x2 = %.1f",-b/(2*a));
            else System.out.printf("The system has 2 roots x1 = %.1f and x2 = %.1f",(-b-Math.sqrt(D))/(2*a),(-b+Math.sqrt(D))/(2*a));
        }
        sc.close();
    }
}
