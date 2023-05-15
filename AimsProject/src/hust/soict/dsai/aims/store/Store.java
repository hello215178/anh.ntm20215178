/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
 *
 * @author DELL
 */
public class Store {
    public static int MAX_NUMBER_ITEMS = 100000;
    DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBER_ITEMS];
    private int numberofItemsInStore = 0;
    
    //Add a new dvd
    public void addDVD(DigitalVideoDisc dvd)
    {
        if (numberofItemsInStore == MAX_NUMBER_ITEMS){
            System.out.println("Number of dics is max!");
        }else{
            itemsInStore[numberofItemsInStore] = dvd;
            numberofItemsInStore++;
        }
    }
    
    //remove a dics 
    public void removeDVD(DigitalVideoDisc dvd){
        boolean changed = false;
        for (int i=0; i<numberofItemsInStore; i++)
            if (itemsInStore[i] == dvd){
                for (int j=i; j<numberofItemsInStore; j++)
                    itemsInStore[j] = itemsInStore[j+1];
                changed = true;
                numberofItemsInStore--;
                }
        if (!changed) System.out.println("There have no removement");
    }
    
    //show item in store
    public void showItems()
    {
        System.out.println("Items:");
        for (int i=0; i<numberofItemsInStore;i++){
            System.out.println(itemsInStore[i].toString());
        }
    }
}
