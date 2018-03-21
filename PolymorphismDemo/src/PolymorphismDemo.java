
public class PolymorphismDemo {

	public static void main(String[] args) {
		// NOT Polymorphic:
		Square s = new Square(5);
		System.out.println(s.getArea());
		
		Circle c = new Circle(5);
		System.out.println(c.getArea());
		
		
		// Polymorphic:
		TwoD_Shape s2 = new Square(5);
		System.out.println(s2.getArea());
		
		TwoD_Shape c2 = new Circle(5);
		System.out.println(c2.getArea());
	}

}
