package iterators;

public class Iterator3 implements Iterator
{
	int[] arr;
	int K;
	int first;
	int last;
	int current;
	
	public Iterator3(int[] arr, int K)
	{
		this.arr = arr;
		first = arr[0];
		last = arr.length;
		current = -1;
		this.K = K;
	}
	
	public int current()
	{
		return arr[current];
	}
	
	public void transform()
	{
		arr[current] *= K;
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
		transform();
		current++;
	}
	public void previous()
	{
		transform();
		current--;
	}
}
