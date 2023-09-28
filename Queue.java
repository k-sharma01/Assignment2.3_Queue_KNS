/**
 * This code represents a queue that holds generic objects
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Queue<T> 
{

	private LinkedList<T> queue; // the generic linked list that will represent the queue
	
	/**
	 * Default constructor initializes the linked list representing the queue
	 */
	public Queue()
	{
		queue = new LinkedList<T>();
	} // end default constructor
	
	
	/**
	 * Enqueues an object to the end of the linked list
	 * @param object the object to enqueue
	 */
	public void enqueue(T object)
	{
		queue.addNode(new Node<T>(object));
	} // end enqueue
	
	
	/**
	 * Dequeues the first object in the queue
	 * @return the first object in the queue
	 */
	public T dequeue()
	{	
		return queue.removeFirstNode().data;
	} // end dequeue
	
	
	/**
	 * Prints the data contained in the current queue
	 */
	public void printQueue()
	{
		if(queue.isEmpty())
		{
			System.out.println("There is nobody left in line!");
			return;
		}
		
		Node<T> currentNode = queue.head;
		while(currentNode != null)
		{
			System.out.print(currentNode.data + "  ");
			currentNode = currentNode.nextNode;
		}
	} // end printQueue
	
} // end class
