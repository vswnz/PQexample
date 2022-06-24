
/**
 * This class asks for information about cars that have been ordered
 * It then puts them into a queue.
 *
 * @author Bill
 * @version 24-Jun-2022
 */
import java.util.Scanner;

public class CarDealer
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class queueOfCars
     */
    public CarDealer()
    {
        // initialise instance variables
        Scanner kb=new Scanner(System.in);
        PQueue<Car> orderBook = new PQueue<Car>(); // note we are not using priority in this example.
        
        boolean keepAsking=true; // keep asking for car information 
        
        // Put stuff into my queue.  Examples.
        while (keepAsking){
            Car thisCar=collectInformation();
            thisCar.printCar();
            orderBook.enqueue(thisCar);
            System.out.println("Enter another car? (yes to continue)");
            String reply=kb.nextLine();
            
            keepAsking=reply.equals("yes");
        } // while keepAsking        
        //Now do stuff with the queue.  
        while (!orderBook.queueEmpty()){
            Car c = orderBook.dequeue();
            c.printCar();
        }
        
    }

    // Ask user for car information and returns a Car object with that info.
    Car collectInformation(){
        Scanner kb=new Scanner(System.in);
        System.out.println("What model is the car?");
        String mod=kb.nextLine();
        System.out.println("What colour is the car?");
        String col=kb.nextLine();
        System.out.println("What date was it ordered?");
        String date=kb.nextLine();
        return new Car(mod,col,date);
    }


}
