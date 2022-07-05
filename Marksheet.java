package Assignment2;
public class Marksheet {

	/**
	 * 
	 * @param marks Array of marks of the students in the class
	 * @return Average marks of the class
	 */
	public double average(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int sumOfMarks = 0;
		for(int mark : marks)
			sumOfMarks += mark;
		return (double)sumOfMarks/marks.length;
	}
	
	/**
	 * 
	 * @param marks Array of marks of the students in the class
	 * @return Maximum marks obtained by the student in  the class
	 */
	public int maximum(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int maximumMarks = 0;
		for(int mark : marks)
		{
			if (mark > maximumMarks)
			{
				maximumMarks = mark;
			}
		}
		return maximumMarks;
	}
	
	/**
	 * 
	 * @param marks Array of marks of the students in the class
	 * @return Minimum marks obtained by the student in  the class
	 */
	public int minimum(int[] marks)
	{
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int minimumMarks = marks[0];
		for(int mark : marks)
		{
			if (mark < minimumMarks)
			{
				minimumMarks = mark;
			}
		}
		return minimumMarks;
	}
	
	/**
	 * 
	 * @param marks Array of marks of the students in the class
	 * @return Percentage of the students who secured marks  >= 40
	 */
	public double percentageOfStudentPassed(int[] marks)  
	{ 
		if (marks.length == 0)
			throw new AssertionError("Marks array can't be empty");
		int passedStudents = 0;
		for(int mark : marks)
		{
			if(mark >= 40)
			{
				passedStudents += 1;
			}
		}
		return ((double)passedStudents/marks.length) * 100;
	}
}
