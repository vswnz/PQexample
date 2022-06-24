
/**
 * Simple queue class that works with generic elements.
 *
 * @author Bill Viggers
 * @version 21-May-2020
 */
public class Queue<O>
{
  private Element<O> front;  // Element at the front of the queue
  private Element<O> end;    // Element at the end of the queue
    
    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        this.front=null;
        this.end=null;
    }

    /*
     * Make a new element with the Item in it.
     * Add it to the end of the queue
     */
    
    void enqueue(O item){
        Element box = new Element(item); // Wrap our item up in a box to put in the queue
        if (this.front == null)  // empty queue
            this.front=box;
         else  // if not empty, then add it at the end of the queue
            this.end.setFollows(box);        
        this.end=box;
    } // enqueue

    /*
     * Remove the front item from the queue
     */
    O dequeue(){
        O hold=this.front.getValue();
        front=this.front.getFollows();
        if (front==null) end=null;
        return hold;
    } // dequeue
          
    /*
     * Says if the queue is empty
    */
   
   public boolean queueEmpty(){
       return this.front==null;
    }
        
}
