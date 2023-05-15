/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import static hust.soict.dsai.aims.store.Store.MAX_NUMBER_ITEMS;

/**
 *
 * @author DELL
 */
public class StoreTest {
    public static void main(String[] args){
    //Create a new cart
        Store store = new Store();

        //Create new dvd object and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd3);
        
        //test the print method
        store.showItems();

        //test search method
        store.removeDVD(dvd3);
        store.showItems();
        

     
    }
}
