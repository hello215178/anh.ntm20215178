/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.newpackage;

/**
 *
 * @author DELL
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = "unknown";
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle(){ return title; }
    public String getCategory(){ return category; }
    public String getDirector(){ return director; }
    public int getLength(){ return length; }
    public float getCost(){ return cost; }
}
