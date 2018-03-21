
public class Square extends TwoD_Shape {
	private int sideLength;
	
	public Square(int s){
		sideLength = s;
	}
	
	public double getArea(){
		return sideLength * sideLength;
	}

}
