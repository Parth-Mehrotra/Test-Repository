/**
 * Representation of a 2 Dimensional box.
 */

public class Box {

	/**
	* This is a peculiar place for a javadoc comment
	*/

	private int x;
	private int y;
	private int w;
	private int h;

	/**
	* Constructs a Box object with a width, height, and position of 0
	*/
	public Box() {
		x = 0;
		y = 0;
		w = 0;
		h = 0;
	}

	/**
	* Constructs a box with the given attributes:
	* 
	* @param x position along the x axis
	* @param y position along the y axis
	* @param w width
	* @param h height
	*/
	public Box(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	* Return's the x position
	* Person 2 comment
	*/
	public int getX() {
		return x;
	}
	
	/**
	* Returns the y position
	*/
	public int getY() {
		return y;
	}

	/**
	 * @return width of the box
	 */
	public int getWidth() {
		return w;
	}

	/**
	* Get the height of the box
	*
	* @return height of box
	*/
	public int getHeight() {
		return h;
	}
	
	//Also a hipster comment
	public int getArea() {
		//I'm a hipster and I don't document the way the rest of the team expects me to
		return w*h;
	}
	
	/** 
	 * This java doc comment is detached 
	 */
	 
	public int getPerimeter() {
		return 2*w + w*h;
	}

	/**
	* Set's all the values to 0
	*/
	public void reset() {
		x = 0;
		y = 0; 
		w = 0;
		h = 0;
	}
}
