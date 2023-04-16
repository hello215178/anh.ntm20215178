/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_1_javalab;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
public class Calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "The result is: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
                "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += "\nSum = " + (num1+num2);
        strNotification += "\nDifference = " + (num1-num2);
        strNotification += "\nProduct = " + (num1*num2);
        strNotification += "\nQuotient = " + (num1/num2);
        JOptionPane.showMessageDialog(null, strNotification,
                "Calculation: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
    }
}