
public class Circle extends TwoD_Shape {

	private int radius;
	
	public Circle(int r){
		radius = r;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
}
