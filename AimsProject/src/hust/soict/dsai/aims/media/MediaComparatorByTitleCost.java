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
public class MediaComparatorByTitleCost implements Comparator<Media> {
    public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	public int compareTitle(String s1, String s2) {
		if(s1.compareTo(s2) > 0)
			return 1;
		else 
			return -1;
		
	}
	
	
	public int compare(Media m1, Media m2) {
		if(compareTitle(m1.title, m2.title) == 1) 
			return 1;
		else 
			return -1;
	}
}
