/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

/**
 *
 * @author DELL
 */
public class Store {
    ArrayList<Media> itemsInStore;
	
	public Store() {
		itemsInStore = new ArrayList<Media> ();
	}
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	
	public void removeMedia(Media media) {
		itemsInStore.remove(media);
	}
	
	public ArrayList<Media> getItemsInStore(){
		return itemsInStore;
	}
	
	public void printStore() {
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println((i+1)+". Media - "+itemsInStore.get(i).getId()+
					" - "+itemsInStore.get(i).getTitle()+
					" - "+itemsInStore.get(i).getCategory()+
					" - "+itemsInStore.get(i).getCost()+"$ ");
		}
	}
}
