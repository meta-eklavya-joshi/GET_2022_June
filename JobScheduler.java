package Assignment1;
public class JobScheduler {
	
	/**
	 * This method return the completion time for each process
	 * @param jobs Array in which jobs are stored
	 * @return Completion time for each jobs
	 */
	public int[] completionTime(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int time = jobs[0][0];
		int[] completiontime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			if(time == jobs[i][0] || time > jobs[i][0])
			{
				completiontime[i] = time + jobs[i][1];
			}
			else
			{
				completiontime[i] = jobs[i][0] + jobs[i][1];
			}
			time = completiontime[i];
		}
		return completiontime;
	}
	
	/**
	 * This method return the turn around time for each process
	 * @param jobs Array in which jobs are stored
	 * @return Turn around time for each jobs
	 */
	public int[] turnAroundTime(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int[] completiontime = completionTime(jobs);
		int[] waitingtime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			waitingtime[i] = completiontime[i] - jobs[i][0];
		}
		return waitingtime;
	}
	
	/**
	 * This method return the waiting time for each array
	 * @param jobs Array in which jobs are stored
	 * @return Waiting time for each jobs
	 */
	public int[] waitingTime(int[][] jobs)
	{
		int[] turnaroundtime = turnAroundTime(jobs);
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int waitingTime []= new int[jobs.length];	//array which store waiting time
		for(int i=0;i<jobs.length;i++)
		{
			waitingTime [i] = turnaroundtime[i] - jobs[i][1];
		}
		return waitingTime;
	}
	
	
	/**
	 * This method returns average waiting time of the process
	 * @param jobs Array in which jobs are stored
	 * @return Average waiting time for the jobs
	 */
	public double averageWaitingTime(int[][] jobs)
	{ 
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int[] waitingtime = waitingTime(jobs);
		int totalWaitingTime = 0;
		for(var time : waitingtime)
		{
			totalWaitingTime += time;
		}
		return totalWaitingTime / jobs.length;
	}
	
	
	/**
	 * This method returns the maximum waiting time by the process
	 * @param Jobs Array in which jobs are stored
	 * @return Maximum waiting time for the jobs 
	 */
	public int maxWaitingTime(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int maxWaitingtime = 0;
		int[] waitingtime = waitingTime(jobs);
		for(int i=0; i < jobs.length; i++)
		{
			if (maxWaitingtime < waitingtime[i])
			{
				maxWaitingtime = waitingtime[i];
			}
		}
		return maxWaitingtime;
	}
	
	/**
	 * This method displays the time for each process
	 * @param time of the jobs
	 */
	public void displayTime(int[] time)
	{
		for(var i : time)
		{
			System.out.println(i);
		}
	}
}
