/**
 * This code represents a linked list
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class LinkedList<T> 
{

	protected Node<T> head; // holds a reference to the first node in linked list
	protected Node<T> tail; // holds a reference to the last node in linked list
	protected int length; // holds the length of the linked list

	/**
	 * Creates a new empty linked list
	 */
	public LinkedList()
	{
		head = tail = null;
		length = 0;
	} // end constructor
	
	
	/**
	 * Determines whether the linked list is empty or not
	 * @return true if the linked list is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return head == null;
	} // end isEmpty
	
	
	/**
	 * Returns the head of this linked list
	 * @return
	 */
	public Node<T> getList()
	{
		return head;
	} // end getList
	
	
	/**
	 * Adds a node to the end of the linked list
	 * @param aNode
	 */
	public void addNode(Node<T> aNode)
	{
		if (isEmpty()) 
		{
			head = aNode;
			tail = head;
			return;
		}
		
		tail.nextNode = aNode;
		tail = tail.nextNode;
		length++;
	} // end addNode
	
	
	/**
	 * Removes the first item (head) of the list
	 * @return the first node in the list
	 */
	public Node<T> removeFirstNode()
	{
		if(isEmpty())
			return null;
		
		Node<T> temp = head;
		head = head.nextNode;
		return temp;
	}
	
} // end class
