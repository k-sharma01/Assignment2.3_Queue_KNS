/**
 * This code represents a generic node for a linked list
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Node<T>
{

	T data; // holds the data in the node of type T
	Node<T> nextNode; // holds reference to the next node
	
	
	/**
	 * Default constructor sets the data to the passed input, and the nextNode to null
	 */
	public Node(T data)
	{
		nextNode = null;
		this.data = data;
	} // end constructor
	
	
	/**
	 * This returns the node object
	 * @return the current node object
	 */
	public Node<T> getNode() 
	{
		return this;
	} // end getNode
	
	
	/**
	 * Sets the next node to the passed node
	 * @param nextNode the node to pass in
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	} // end setNextNode
	
} // end class
