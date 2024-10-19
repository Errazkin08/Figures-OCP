package figure;

public class Diamond extends Figure {
	public Diamond(int x, int y) {
		super(x, y);
	}

	private float diagonal1;
	private float diagonal2;

	@Override
	public void drawXML() {
		System.out.println("diamond,"+getX()+","+getY()+","+diagonal1+","+diagonal2);
	}
	@Override
	public void drawCSS() {
		System.out.println("<diamond><x>"+getX()+"</x> <y>"+getY()+"</y> <d1>"+diagonal1+"</d1> <d2>"+diagonal2+"</d2> </diamond>");
	}

	public float getArea() {
		return diagonal1*diagonal2;
	}

	public float getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(float diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public float getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(float diagonal2) {
		this.diagonal2 = diagonal2;
	}

}
