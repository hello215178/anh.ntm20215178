/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort_array;

/**
 *
 * @author DELL
 */
public class Sort_array {

    
    public static void main(String[] args) {
        int a[] = {1789, 2035, 1899, 1456, 2013};
        int n = 5; int t;
        int sum = 0;
        double avg = 0;
        for (int i=0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (a[i]>a[j]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i=0;i<n;i++) 
            sum += a[i];
        System.out.println("The result after sorting: ");
        for (int i=0;i<n;i++) System.out.print(a[i] + " ");
        System.out.println("\nThe sum is: "+ sum);
        System.out.println("The average is: "+ (sum/n));
    }
    
}
