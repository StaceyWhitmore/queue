package queue;

import javax.swing.JOptionPane;

public class TestQueue {

	public static void main(String[] args)
	{
		Queue<String> queue = new Queue<String>();//create LinkedList<>object from Queue<> class
		
		String howMany = JOptionPane.showInputDialog("How many items would you like to add to the queue?");
		int items = Integer.parseInt(howMany);
		
		for (int i = 0; i < items; i++)
		{
		String string = JOptionPane.showInputDialog("Enter an item to queue.");
		
		
		
		queue.enqueue(string);//use the enqueue() method created in GenericQueue
		System.out.println("(" + i + ")"  + queue);
		
		
		}//close for loop
		
		
		
		
		String additional = JOptionPane.showInputDialog(null, 
				"Enter (1) to add another item to enqueue an item (2) to dequeue and item, "
				+ "or (3) to terminate program and display queue.");
		
		int choice = Integer.parseInt(additional);
		
		
		switch (choice)
		{
		case 1:
			String string = JOptionPane.showInputDialog("Enter an item to queue.");
			queue.enqueue(string);
			JOptionPane.showMessageDialog(null, queue.toString());
			break;
			
		case 2:
			queue.dequeue();
			JOptionPane.showMessageDialog(null, "Last item was removed from queue " + queue.toString());
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, queue.toString());
			break;
				
		}//close switch()
		System.out.println(queue.toString());
		

	}//close main()

}//close class: TestQueue
