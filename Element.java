
/**
 * Element in a queue.
 *
 * @author  Bill Viggers
 * @version 21-May-2020
 *
 *
 *  This is a very simiple generic class.
 *  Each element holds something, and a link to the thing in the queue that 
 *  follows it.
 *  
 */
public class Element<E>    // E will be the type of thing we store in our queue
{
    
    private E iHold; // What is it a queue of ?
    private Element next;  // Who is next after me in the queue?
    
    /**
     * Constructor for objects of class Element
     * Give it the contents, and who comes after it.
     * 
     */
    public Element(E putIn)
    {
        this.iHold=putIn;
        this.next=null;
    }

    
    /*
     *  Set the identity of the element that follows me. 
     */
    public void setFollows(Element followingMe){
        this.next=followingMe;
    }
    
    /*
     * Find out the identity of the element that follows me
     */
    public Element getFollows(){
        return this.next;
    }

    /*
     * Say what element is actually being held.
     */
    public E getValue(){
        return this.iHold;
    }
}

