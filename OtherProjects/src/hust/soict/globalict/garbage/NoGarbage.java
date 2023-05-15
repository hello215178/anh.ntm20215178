/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author DELL
 */
public class NoGarbage {
    public static void main(String[] args)throws Exception {
		String filename = "C:\\Users\\DELL\\OneDrive - Hanoi University of Science and Technology\\Desktop\\anh.ntm20215178\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\test.txt"; 
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		inputBytes=Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
				

	}
}
