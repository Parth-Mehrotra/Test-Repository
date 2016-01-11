/**
 * Representation of a 2 Dimensional box.
 */

public class Box {

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

	public Box(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}

	public int getArea() {
		return w*h;
	}
	
	public int getPerimeter() {
		return 2*w + w*h;
	}
}
