package src.abbas;
public class Circle {
	private double radius;
	private String color;
	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if(radius>=0)this.radius = radius;
		else System.out.println("only postive decimals");
		
	}

	public String getColor() {
		return color;
	}

	public void  setColor(String color) {
		 this.color = color;
	}
	public double  getArea() {
		return radius *radius *3.14;
		
	}
	public double getcircumference() {
		return radius *2*3.14;
		
	}
	public static void main(String[] args) {
		circle2 circle2=new circle2();
		circle2.setRadius(5);
		System.out.println(circle2.getArea());
	}
}

