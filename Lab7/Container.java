package Lab7;

import java.util.*;
import java.io.*;
/**
 * This class is a container that holds an unlimited number of 
 * String objects. It is able to remove objects and add objects.
 */

public class Container {
	// No instance variable should be defined for this class. 

	/**
	 * Reads the given file and add it into a list. 
	 * Each element of the list contains one line of the file. 
	 * @param fileName is the name of the file that is read in this method. 
	 */

	public static List<String> readFile(String fileName) {
		List<String> lines = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(fileName))) {
        	while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException exception) {
        	exception.printStackTrace();
        }
        return lines;
    }

	List<Object> container = new ArrayList<>();
	
	/**
	 * This method adds the <code> obj </code> to the container.
	 * @param obj is the object that is added to the container.
	 */
	
	void add(Object object) {
		container.add(object);
		// insert your code here
	}

	/**
	 * This method removes the object from the container
	 * @return returns the removed object.
	 */
	Object remove() {
		if (container.isEmpty()) {
			throw new EmptyStackException();
		}
		return container.remove(container.size() -1);
	}
	
	/**
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		// insert your code here. You may want to change the return value. 
		return container.size();
	}

}

/**
 * 
 * This class simulates a Queue, which is a data structure that insert and remove data 
 * by FIFO (first-in, first-out) rule
 *
 */
class Queue extends Container{
	ArrayList<String> queue; 
	
	/**
	 * This is the constructor that initializes the <code> queue </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Queue"
	 * @param fileName is the name of the file that is read.  
	 */
	public Queue(String fileName) {
		super();
		List<String> lines = readFile(fileName);
		this.queue = new ArrayList<>(lines);

		// insert your code here
	}
	
	/**
	 * This method adds the object into the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 * @param obj is the object that is added to the queue. 
	 */
	@Override
	public void add(Object obj) {
			queue.add((String) obj);
		} 

	/**
	 * This method removes an object from the Queue. 
	 * Please note that the rule of the queue insertion/removal is 
	 * First in, First out. 
	 */
	 @Override
	 public Object remove() {
		 if (!queue.isEmpty()) {
			 return queue.remove(0);
		 }
		 return null;
	 }
	/**
	 * @return returns the object which is in front of the queue.
	 */
	public Object top() {
		if (queue.isEmpty()) {
			return null;
		}
		return queue.get(0);
	}
	
	/**
	 * Returns the number of items in the queue.
	 */
	@Override 
	public int getSize(){
		// insert your code here. You may want to change the return value. 
		return queue.size();
	}
}

/**
 * 
 * This class simulates a Stack, which is a data structure that insert and remove data 
 * by FILO (first-in, last-out) rule
 *
 */
class Stack extends Container{
	ArrayList<String> stack; 
	
	/**
	 * This is the constructor that initializes the <code> stack </code>
	 * with all the strings in the <code> fileName </code> that is labeled 
	 * by "Stack"
	 * @param fileName is the name of the file that is read.  
	 */
	public Stack(String fileName) {
        super();
        List<String> lines = readFile(fileName);
        this.stack = new ArrayList<>(lines);
	}
        
    

        
        // insert your code here.
  
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public void add(Object obj) {
		 this.stack.add(0,(String) obj);
        }
	/**
	 * This method removes an object from the stack. 
	 * Please note that the rule of the stack insertion/removal is 
	 * First in, Last out. 
	 */

	@Override
	public Object remove() {
	    if (stack.isEmpty()) {
	        throw new RuntimeException("Stack is Empty");
	    }
	    return this.stack.remove(0);
	}
	/**
	 * @return returns the object which is on top of the stack.
	 */
	
	public Object top() {
		if (stack.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		// insert your code here. You may want to change the return value. 
		return this.stack.get(0);
	}
	/**
	 * Returns the number of items in the stack.
	 */
	@Override 
	public int getSize() {
		// insert your code here. You may want to change the return value. 
		return this.stack.size();
	}
}