/**
 * Representation of a 2 Dimensional box.
 */

public class Box {

	private int x;
	private int y;
	private int w;
	private int h;

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

	public int getArea() {
		return w*h;
	}
	
	public int getPerimeter() {
		return 2*w + w*h;
	}
}
