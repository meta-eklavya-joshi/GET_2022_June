
public class JobScheduler {
	
	public int[] completionTime(int[][] jobs)
	{
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
	
	
	
	public int[] waitingTime(int[][] jobs)
	{
		int time = jobs[0][0];
		int[] waitingtime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			if (time > jobs[i][0])
			{
				waitingtime[i] = time - jobs[i][0];
			}
			else
			{
				time = jobs[i][0] + jobs[i][1];
			}
		}
		return waitingtime;
	}
	
	
	
	
	public int[] turnAroundTime(int[][] jobs)
	{
		int[] completiontime = completionTime(jobs);
		int[] waitingtime = new int[jobs.length];
		for(int i=0; i < jobs.length; i++)
		{
			waitingtime[i] = completiontime[i] - jobs[i][0];
		}
		return waitingtime;
	}
	
	public int[] burstTime(int[][] jobs)
	{
		int[] bursttime = new int[jobs.length];
//		int time = 0;
//		for(int i=0; i<jobs.length; i++)
//		{
//			if(time <= jobs[i][0])
//			{
//				bursttime[i] = jobs[i][1];
//			}
//			else
//			{
//				bursttime[i] = time - jobs[i][0] + jobs[i][1];
//			}
//		}
		int[] waitingtime = waitingTime(jobs);
		int[] turnAroundtime = turnAroundTime(jobs);
		for(int i=0; i<jobs.length; i++)
		{
			bursttime[i] = turnAroundtime[i] - waitingtime[i];
		}
		return bursttime;
	}
	
	public double averageWaitingTime(int[][] jobs)
	{
		int[] waitingtime = waitingTime(jobs);
		int totalWaitingTime = 0;
		for(var time : waitingtime)
		{
			totalWaitingTime += time;
		}
		return totalWaitingTime / jobs.length;
	}
	
	
	
	public int maxWaitingTime(int[][] jobs)
	{
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
	
	
	public void displayTime(int[] time)
	{
		for(var i : time)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int [][] jobs = {{0,10},{6,20},{60,10},{110,5}};
		JobScheduler obj = new JobScheduler();
		int[] completiontime = obj.completionTime(jobs);
		System.out.println("Completion Time for Each Process: ");
		obj.displayTime(completiontime);
		int[] turnAroundtime = obj.turnAroundTime(jobs);
		System.out.println("Turn Around Time for Each Process: ");
		obj.displayTime(turnAroundtime);
		int[] waitingtime = obj.waitingTime(jobs);
		System.out.println("Waiting Time for Each Process: ");
		obj.displayTime(waitingtime);
		System.out.println("Average Waiting Time: " + obj.averageWaitingTime(jobs));
		System.out.println("Maximum Waiting Time: " + obj.maxWaitingTime(jobs));
	}

}
