/**
 * This application tests the queue class on a hypothetical restaurant line
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Application 
{

	public static void main(String[] args) 
	{
		// Creates a queue of string
		Queue<String> customerLine = new Queue<String>();
		
		// Enqueue Bill, Alice, and Bob
		customerLine.enqueue("Bill");
		customerLine.enqueue("Alice");
		customerLine.enqueue("Bob");
		
		System.out.print("Current Line: (front to back):  ");
		customerLine.printQueue();
		
		// Serve the first customer in line (Bill)
		System.out.println("\n\nA customer is served: " + customerLine.dequeue());
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();
		
		// Jane arrives
		System.out.println("\n\nJane arrives.");
		customerLine.enqueue("Jane");
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();
		
		// Hamad arrives
		System.out.println("\n\nHamad arrives.");
		customerLine.enqueue("Hamad");
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();		
		
		// Serve the first customer in line (Alice)
		System.out.println("\n\nA customer is served: " + customerLine.dequeue());
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();
		
		// Serve the first customer in line (Bob)
		System.out.println("\n\nA customer is served: " + customerLine.dequeue());
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();
		
		// Serve the first customer in line (Jane)
		System.out.println("\n\nA customer is served: " + customerLine.dequeue());
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();
		
		// Serve the first customer in line (Hamad)
		System.out.println("\n\nA customer is served: " + customerLine.dequeue());
		System.out.print("\nUpdated Line: (front to back):  ");
		customerLine.printQueue();

	} // end main

} // end class
