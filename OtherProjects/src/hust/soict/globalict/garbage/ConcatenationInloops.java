/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.garbage;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class ConcatenationInloops {
    public static void main(String[] args){
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i=0; i<65536; i++) s+=r.nextInt(2);
        System.out.println(System.currentTimeMillis()-start);
        
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<65536; i++) sb.append(r.nextInt(2));
        s= sb.toString();
        System.out.println(System.currentTimeMillis()-start);
    }
}
