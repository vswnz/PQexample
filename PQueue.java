/**
 * PQueue here.  A wrap-around that uses an existing queue class to make a priority queue.
 * 
 * Enqueue takes a boolean, which tells you whether it is high priority or not.
 *
 * @author Bill
 * @version 12-Apr-2021
 */
public class PQueue<O> {
    private Queue<O> lowP; // low priority queue
    private Queue<O> highP; // the important folk.

    public PQueue(){
       lowP = new Queue();
       highP= new Queue();
    } // constructor
    
    
// enqueue when we know the priority
    void enqueue(O name, boolean high){
    if (high)
        highP.enqueue(name);
    else
        lowP.enqueue(name);        
    } //enqueue

// if we are not told the priority, then it is low.
    void enqueue(O name){
        lowP.enqueue(name);        
    } //enqueue

    
    O dequeue(){
        if (highP.queueEmpty()) {
            return lowP.dequeue();
        }
        else 
            return highP.dequeue();
    } //dequeue
    
    boolean queueEmpty(){
        if (highP.queueEmpty() && lowP.queueEmpty()) 
            return true;
        else 
            return false;
        } //queueEmpty 
} //class

