package xspeedit.test;

/**
 * Class for the Box object
 * 
 * @author jfatou
 *
 */
public class Box {

	/**
	 * The capacity of the box
	 */
	private int capacity;

	/**
	 * The content of the box
	 */
	private String content = "";

	/**
	 * Create a new box with a given capacity
	 * 
	 * @param capacity
	 *            The capacity of the box
	 */
	public Box(int capacity) {
		super();
		this.capacity = capacity;
	}

	/**
	 * Create a new box with a given capacity and content
	 * 
	 * @param capacity
	 *            The capacity of the box
	 * @param content
	 *            The content of the box
	 */
	public Box(int capacity, String content) {
		super();
		this.capacity = capacity;
	}

	/**
	 * Get the capacity of the box
	 * 
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Set the capacity of the box
	 * 
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Get the content of the box
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Add a value to the content of the box, the capacity of the box is
	 * automatically decreased.
	 * 
	 * @param value
	 *            The int value to be added to the content of the box
	 */
	public void addContent(int value) {
		content = content + Integer.toString(value);
		capacity = capacity - value;
	}

}
