/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.disc;

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
    private static int nbDigitalVideoDisc = 0;
    private int id;

    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc++;
        setId();
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = "unknown";
        nbDigitalVideoDisc++;
        setId();
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
        setId();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
        setId();
    }
    
    public String toString()
    {
        String discInfo = getId() + ".DVD - " + getTitle() + " - " + getCategory() + " - " +getDirector() + getLength() + " - " +":" +getCost() + "$";
        return discInfo;
    }
    
    public boolean isMatch(int id)
    {
        return getId() == id;
    }
    
    boolean isMatch(String title)
    {
        return getTitle().equals(title);
    }
    
    public String getTitle(){ return title; }
    public String getCategory(){ return category; }
    public String getDirector(){ return director; }
    public int getLength(){ return length; }
    public float getCost(){ return cost; }
    public int getId() {return id;}
    
    public void setTitle(String title){ this.title = title;}
    public void setCategory(String category){ this.category = category;}
    public void setDirector(String director){ this.director = director;}
    public void setLength(int length){ this.length = length;}
    public void setCost(float cost){ this.cost = cost;}
    public void setId() {this.id = nbDigitalVideoDisc;}
}
