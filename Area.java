package Assignment2;
public class Area {

	/**
	 * 
	 * @param width Width of the triangle for finding area
	 * @param height Height of the triangle for finding area
	 * @return Area of the triangle
	 */
	public double areaOfTriangle(double width, double height)
	{
		return (double)(width * height)/2;
	}
	
	/**
	 * 
	 * @param width Width of the rectangle for finding area
	 * @param height Height of the rectangle for finding area
	 * @return Area of the rectangle
	 */
	public double areaOfRectangle(double width, double height)
	{
		return (double)(height * width);
	}
	
	
	/**
	 * 
	 * @param width Width of the square for finding area
	 * @return Area of the square
	 */
	public double areaOfSquare(double width)  
	{
		return (double)(width*width);
	}
	
	
	/**
	 * 
	 * @param width Width of the circle for finding area
	 * @return Area of the circle
	 */
	public double areaOfCircle(double radius)  
	{
		return (double)(3.14 * radius * radius);
	}
}
