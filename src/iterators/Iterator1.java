package iterators;

public class Iterator1 implements Iterator
{
	int D1, D2, N;
	int current;
	
	public Iterator1(int D1, int D2, int N)
	{
		this.D1 = D1;
		this.D2 = D2;
		this.N = N;
		current = N + 1;
	}
	
	public boolean hasNext()
	{
		return current < N;
	}
	public boolean hasPrevious()
	{
		return current > 0;
	}
	
	public int current()
	{
		return current;
	}
	
	public boolean accept(int k)
	{
		return (k%D1 == 0 && k%D2 == 0);
	}
	
	public void moveForwards()
	{
		while(!accept(current)&&hasNext())
			current++;
	}
	
	public void moveBackwards()
	{
		while(!accept(current)&&hasPrevious())
			current--;
	}
	
	public void first()
	{
		current = 0;
	}
	
	public void last()
	{
		current = N;
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
