package recursion.model;

public class RecursionTimer 
{
private long executionTime;

public RecursionTimer()
{
	executionTime = 0;
}

public void startTimer()
{
	executionTime = System.nanoTime();
}

public void resetTimer()
{
	executionTime = 0;
}

public void stopTimer()
{
	executionTime = System.nanoTime() - executionTime;
}

public String toString()
{
	String info = "The execution time is " + executionTime + " in nanoseconds";
	info += "\nThat means " + ((double) executionTime )/ 1000000000 + " in seconds";
	
	return info;
}
}
