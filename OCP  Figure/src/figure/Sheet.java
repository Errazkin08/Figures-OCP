package figure;


import java.util.List;

public class Sheet {
	private List<Figure> figurak;
	
	int area=0;
	
	public void addFigura(Figure f) {
		figurak.add(f);
	}
	public void drawFigures(){
		for(Figure f:figurak) {
			
			f.drawXML();
			f.drawCSS();
		}
	}
	public List<Figure> getFigurak() {
		return figurak;
	}
	public void setFigurak(List<Figure> figurak) {
		this.figurak = figurak;
	}

}
