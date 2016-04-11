package iterators;

public interface Iterator
{
	public void next();
	public void previous();
	public void first();
	public void last();
	public boolean hasNext();
	public boolean hasPrevious();
	public int current();
}
