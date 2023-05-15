/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
 *
 * @author DELL
 */
public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());

    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    
    //fix swap function
    public static void swap(DigitalVideoDisc d1, DigitalVideoDisc d2)
    {
        //swap all properties of d1, d2, not only swap o1, o2
        String tmp = d1.getTitle();
        d1.setTitle(d2.getTitle());
        d2.setTitle(tmp);
    }
}
