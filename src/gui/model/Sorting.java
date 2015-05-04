package gui.model;

public class Sorting
{
	private long startTime;
	private long endTime;
	private long sortTime;
	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public Gui[] selectionSort(Gui[] unsortedThings)
	{
		
		Gui maximum;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		
		for(int position = 0; position < unsortedThings.length; position++)
		{
			maximumPosition = position;
			maximum = unsortedThings[position];
			for(int next = position +1; next < unsortedThings.length; next++)
			{
				if(unsortedThings[next].compareTo(maximum) > 0)
				{
					maximum = unsortedThings[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(unsortedThings, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
				
		return unsortedThings;
				
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		timeToSort += "Days: " + sortTime/(1000*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 + "\n";
		timeToSort += "miliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
	}
	
	
	private void swap(Gui[] array, int position, int change)
	{
		Gui temp = array[position];
		array[position] = array[change];
	    array[change] = temp;
	}
	
}
