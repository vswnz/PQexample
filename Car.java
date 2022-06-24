
/**
 * Car class
 * This class remembers information for cars that 
 * have been ordered.  It holds the car make, the colour
 * and the date the order was put in.
 *
 * @author Bill
 * @version 24-Jun-2022
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String model;
    private String colour;
    private String date;

    /**
     * Constructor for objects of class Car
     */
    public Car(String mod, String col, String dt)
    {
        this.model=mod;
        this.colour=col;
        this.date=dt;
    }
    
    
    // method to print out car information
    public void  printCar(){
        System.out.println("A "+this.model+" car coloured "+this.colour+" was ordered on "+this.date);
    }
    
    
    public String model(){ return this.model;}
    public String colour(){ return this.colour;}
    public String date(){ return this.date;}
    
    
}
