package figure;

public class Square extends Figure {

	public Square(int x, int y) {
		super(x, y);
	}

	private	float lenght;

	@Override
	public void drawXML() {
		System.out.println("square,"+getX()+","+getY()+","+lenght);
	}
	@Override
	public void drawCSS() {
		System.out.println("<square><x>"+getX()+"</x> <y>"+getY()+"</y> <len>"+lenght+"</len> </circle>");
	}
	public float getArea() {
		return lenght*lenght;
	}
	public float getLenght() {
	
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	
}
