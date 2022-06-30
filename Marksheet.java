import java.util.Scanner;

public class Marksheet {

	
	public double average(int[] marks)
	{
		int sumOfMarks = 0;
		for(int mark : marks)
			sumOfMarks += mark;
		return (double)sumOfMarks/marks.length;
	}
	
	public int maximum(int[] marks)
	{
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
	
	
	public int minimum(int[] marks)
	{
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
	
	
	public double percentageOfStudentPassed(int[] marks)
	{
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
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = scanner.nextInt();
		int[] studentsMarks = new int[n];
		System.out.println("Enter marks of Students:");
		for(int i=0; i<n; i++)
		{
			studentsMarks[i] = scanner.nextInt();
		}
		Marksheet obj = new Marksheet();
		
		System.out.println(String.format("%.2f",obj.average(studentsMarks)));
		System.out.println(obj.maximum(studentsMarks));
		System.out.println(obj.minimum(studentsMarks));
		System.out.println(String.format("%.2f",obj.percentageOfStudentPassed(studentsMarks)));
	}

}
