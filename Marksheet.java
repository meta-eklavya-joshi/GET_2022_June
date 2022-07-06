package Assignment2;
public class Marksheet {

	/**
	 * This method return the average marks of the class
	 * @param marks : integer array of marks of the students in the class
	 * @return double value average marks of the class
	 */
	public double averageMarksOfTheClass(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int sumOfMarks = 0;
		for(int mark : marks)
		{
			if(mark < 0 || mark > 100)
				throw new AssertionError("Marks are out of range 0 - 100");
			sumOfMarks += mark;
		}
		return (double)sumOfMarks/marks.length;
	}
	
	/**
	 * This method return the maximum marks of the class
	 * @param marks : integer array of marks of the students in the class
	 * @return integer value maximum marks obtained by the student in  the class
	 */
	public int maximumMarksOfTheClass(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int maximumMarks = 0;
		for(int mark : marks)
		{
			if(mark < 0 || mark > 100)
				throw new AssertionError("Marks are out of range 0 - 100");
			if (mark > maximumMarks)
			{
				maximumMarks = mark;
			}
		}
		return maximumMarks;
	}
	
	/**
	 * This method returns the minimum marks of the class
	 * @param marks : integer array of marks of the students in the class
	 * @return integer value minimum marks obtained by the student in  the class
	 */
	public int minimumMarksOfTheClass(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int minimumMarks = marks[0];
		for(int mark : marks)
		{
			if(mark < 0 || mark > 100)
				throw new AssertionError("Marks are out of range 0 - 100");
			if (mark < minimumMarks)
			{
				minimumMarks = mark;
			}
		}
		return minimumMarks;
	}
	
	/**
	 * This method returns the percentage of students that passed
	 * @param marks Array of marks of the students in the class
	 * @return Percentage of the students who secured marks  >= 40
	 */
	public double percentageOfStudentPassedInTheClass(int[] marks)  
	{ 
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int passedStudents = 0;
		for(int mark : marks)
		{
			if(mark < 0 || mark > 100)
				throw new AssertionError("Marks are out of range 0 - 100");
			if(mark >= 40)
			{
				passedStudents += 1;
			}
		}
		return ((double)passedStudents/marks.length) * 100;
	}
}
