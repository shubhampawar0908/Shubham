package interface1;

interface GeometricObject
{
	double getArea();
	double getPerimeter();
	
}

class Circle implements GeometricObject
{
	double radius;
	 
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea() {
		
		double area=(3.14*this.radius*this.radius);
		
		return area;
	}

	
	public double getPerimeter() {
		
		double perimeter=(2*3.14*this.radius);
		return perimeter;
	}
}

class Rectangle implements GeometricObject
{
	double width;
	double length;
	
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}

	
	public double getArea() {
		
		double area=(this.width*this.length);
		
		return area;
	}

	
	public double getPerimeter() {
		double perimeter=(2*(this.length+this.width));
	    return perimeter;
	}
}

public class Ass9 {

	public static void main(String[] args) {
		
	 Circle c=new Circle(6);
	 System.out.println(c.getArea());
	 System.out.println(c.getPerimeter());
	 
	 Rectangle m=new Rectangle(6.5,5);
	  
	 System.out.println(m.getPerimeter());
	 

	}

}
