/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

/**
 *
 * @author CENTIC
 */
public abstract class  TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    public TransportService(){
        
    }
    public TransportService(int id, String origin, String destination, double price){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
    }
    public final void setId(int id){
    this.id = id;
    }
    
    public final void setOrigin(String origin){
    this.origin = origin;
    }
    
    public final void setDestination(String destination){
    this.destination = destination;
    }
    
    public final void setPrice(double price){
    this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String str = "\nid=" + this.getId() + "\norigin=" + this.getOrigin() + "\ndestination=" + this.getDestination() + "\n price=" + this.getPrice() ;
        return str;
    }
    
    public abstract String getService();
    public abstract String getLuggageInformation();
    
    
}
