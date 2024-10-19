package figure;

public class Circle extends Figure {
	public Circle(int x, int y) {
		super(x, y);
	}

	private float diameter;


	@Override
	public void drawXML() {
		System.out.println("circle,"+getX()+","+getY()+","+diameter/2);
	}
	@Override
	public void drawCSS() {
		System.out.println("<circle><x>"+getX()+"</x> <y>"+getY()+"</y> <r>"+diameter/2+"</r> </circle>");
	}
	public float getArea() {
		return ((float)3.14)*((diameter/2)*(diameter/2));
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	

}
