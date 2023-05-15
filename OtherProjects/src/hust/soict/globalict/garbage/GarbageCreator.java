/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author DELL
 */
public class GarbageCreator {
    public static void main(String[] args)
    {
        String filename = "C:\\Users\\DELL\\OneDrive - Hanoi University of Science and Technology\\Desktop\\anh.ntm20215178\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;
        try{
            inputBytes = Files.readAllBytes(Paths.get(filename));
            
        } catch(IOException e){
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        String outputString = "";
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b: inputBytes){
            outputStringBuilder.append((char) b);
        }
        outputString = outputStringBuilder.toString();
        System.out.println(outputString);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
