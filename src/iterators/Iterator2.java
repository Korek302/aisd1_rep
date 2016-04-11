package iterators;

public class Iterator2 implements Iterator
{
	int[] arr;
	int first;
	int last;
	int current;
	
	public Iterator2(int[] arr)
	{
		this.arr = arr;
		first = arr[0];
		last = arr[0] + arr.length - 1;
		current = -1;
	}
	public int current()
	{
		return arr[current];
	}
	public boolean accept(int k)
	{
		return k%2 == 0;
	}
	
	public void moveForwards()
	{
		while(!accept(current())&&hasNext())
			current++;
	}
	
	public void moveBackwards()
	{
		while(!accept(current())&&hasPrevious())
			current--;
	}
	
	public void first()
	{
		current = first;
	}
	public void last()
	{
		current = last;
	}
	public boolean hasNext()
	{
		return current < last;
	}
	public boolean hasPrevious()
	{
		return current > first;
	}
	public void next()
	{
		current++;
		moveForwards();
	}
	public void previous()
	{
		current--;
		moveBackwards();
	}
	
	
}
