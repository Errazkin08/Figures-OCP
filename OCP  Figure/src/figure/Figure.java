package figure;

public abstract class Figure {
	private int x;
	private int y;
	
	public Figure(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void drawXML();
	public abstract void drawCSS();
	public abstract float getArea();
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

