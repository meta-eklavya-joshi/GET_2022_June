import java.util.Scanner;

public class Area {

	public double areaOfTriangle(double width, double height)
	{
		return (double)(width * height)/2;
	}
	
	
	public double areaOfRectangle(double width, double height)
	{
		return (double)(height * width);
	}
	
	
	public double areaOfSquare(double width)
	{
		return (double)(width*width);
	}
	
	
	public double areaOfCircle(double radius)
	{
		return (double)(3.14 * radius * radius);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Area obj = new Area();
		System.out.println("Enter width of the Triangle: ");
		double widthofTriangle = scanner.nextDouble();
		System.out.println("Enter height of the Triangle: ");
		double heightofTriangle = scanner.nextDouble();
		System.out.println("Area of Triangle: " + obj.areaOfTriangle(widthofTriangle,heightofTriangle));
		System.out.println("Enter width of the Rectangle: ");
		double widthofRectangle = scanner.nextDouble();
		System.out.println("Enter height of the Rectangle: ");
		double heightofRectangle = scanner.nextDouble();
		System.out.println("Area of Rectangle: " + obj.areaOfRectangle(widthofRectangle,heightofRectangle));
		System.out.println("Enter width of the Square: ");
		double widthofSquare = scanner.nextDouble();
		System.out.println("Area of Square: " + obj.areaOfSquare(widthofSquare));
		System.out.println("Enter radius of the Circle: ");
		double radiusofCircle = scanner.nextDouble();
		System.out.println("Area of Circle: " + obj.areaOfCircle(radiusofCircle));
	}

}
