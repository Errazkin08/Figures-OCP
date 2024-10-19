package figure;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Circle c1=new Circle(5,1);
		c1.setDiameter((float) 8.9);
		
		Circle c2= new Circle(1,9);
		c2.setDiameter((float) 2.9);
		
		Square s=new Square(2,4);
		s.setLenght(5);
		
		Diamond d= new Diamond(0,0);
		d.setDiagonal1(3);
		d.setDiagonal2(2);
		
		
		List<Figure> f= new LinkedList<>();
		f.add(c1);
		f.add(c2);
		f.add(s);
		f.add(d);
		
		Sheet sheet=new Sheet();
		
		sheet.setFigurak(f);
		
		
		sheet.drawFigures();

	}

}
