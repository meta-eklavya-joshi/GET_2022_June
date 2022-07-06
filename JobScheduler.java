package Assignment1;
public class JobScheduler {
	
	/**
	 * This method return the completion time for each process
	 * @param jobs : integer array in which jobs are stored
	 * @return integer array of the completion time for each jobs
	 */
	public int[] completionTimeOfEachJob(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int time = jobs[0][0];
		int[] completiontime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			if(time >= jobs[i][0])
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
	 * @param jobs : integer array in which jobs are stored
	 * @return integer array of the turn around time for each jobs
	 */
	public int[] turnAroundTimeOfEachJob(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int[] completiontime = completionTimeOfEachJob(jobs);
		int[] waitingtime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			waitingtime[i] = completiontime[i] - jobs[i][0];
		}
		return waitingtime;
	}
	
	/**
	 * This method return the waiting time for each array
	 * @param jobs : integer array in which jobs are stored
	 * @return integer array of the waiting time for each jobs
	 */
	public int[] waitingTimeOfEachJob(int[][] jobs)
	{
		int[] turnaroundtime = turnAroundTimeOfEachJob(jobs);
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
	 * @param jobs : integer array Array in which jobs are stored
	 * @return double value of the average waiting time for the jobs
	 */
	public double averageWaitingTimeOfTheJob(int[][] jobs)
	{ 
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int[] waitingtime = waitingTimeOfEachJob(jobs);
		int totalWaitingTime = 0;
		for(var time : waitingtime)
		{
			totalWaitingTime += time;
		}
		return totalWaitingTime / jobs.length;
	}
	
	
	/**
	 * This method returns the maximum waiting time by the process
	 * @param jobs : integer array in which jobs are stored
	 * @return integer value of the maximum waiting time for the jobs 
	 */
	public int maxWaitingTimeOfTheJob(int[][] jobs)
	{
		if (jobs.length == 0)
			throw new AssertionError("Jobs array can't be empty");
		int maxWaitingtime = 0;
		int[] waitingtime = waitingTimeOfEachJob(jobs);
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
