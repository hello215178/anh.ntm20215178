/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class MediaComparatorByCostTitle implements Comparator<Media>{
     public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}

	
	public int compare(Media m1, Media m2) {
		if(m1.cost >= m2.cost)
			return -1;
		else 
			return 1;
	}
}
