/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasics;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.print("Enter the height of triangle: ");
        height = sc.nextInt();
        for (int i=1; i<=height; i++){
            for (int j=1; j<=(height - i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
               
        }
        sc.close();
        
    }
    
}
