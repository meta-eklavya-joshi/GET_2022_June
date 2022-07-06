package Assignment2;
public class Area {

	/**
	 * This method return the area of the triangle
	 * @param width : double value width of the triangle for finding area
	 * @param height double value height of the triangle for finding area
	 * @return double value area of the triangle
	 */
	public double areaOfTriangle(double width, double height)
	{
		return (double)(width * height)/2;
	}
	
	/**
	 * This method return the area of the rectangle
	 * @param width : double value width of the rectangle for finding area
	 * @param height double value height of the rectangle for finding area
	 * @return double value area of the rectangle
	 */
	public double areaOfRectangle(double width, double height)
	{
		return (double)(height * width);
	}
	
	
	/**
	 * This method return the area of the square
	 * @param width : double value width of the square for finding area
	 * @return double value area of the square
	 */
	public double areaOfSquare(double width)  
	{
		return (double)(width*width);
	}
	
	
	/**
	 * This method return the area of the circle
	 * @param width : double value width of the circle for finding area
	 * @return double value area of the circle
	 */
	public double areaOfCircle(double radius)  
	{
		return (double)(3.14 * radius * radius);
	}
}
