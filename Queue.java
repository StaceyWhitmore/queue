package queue;
import java.util.LinkedList;//implements LinkedList<> instead of ArrayList<>

/* This Queues use a FIFO (first-in first-out) data structure
 * 
 * SEE GENERIC TYPES*/
public class Queue<E>
{
	private LinkedList<E> linkedList = new LinkedList<E>();//create a LinkedList<> object w/refvar queue
	
	
	//create an enqueue() method
	public void enqueue(E e)//pass the item to be added to the LinkedList
	{
		linkedList.addLast(e);//item is converted to a LinkedList object and added to the queue
	}
	
	//create a dequeue() method
	public E dequeue()//return type: E. Returns an E object
	{
		return linkedList.removeFirst();//removes first item from LinkedList(Queue)
	}
	
	//a method to get the current size of the queue
	public int getSize()
	{
		return linkedList.size();
	}
	
	//converts entire queue(linkedList object) to a string and returns it for printing out
	@Override
	public String toString()
	{
		return "Queue: " + linkedList.toString();
	}
	
	
}//close class: Queue
