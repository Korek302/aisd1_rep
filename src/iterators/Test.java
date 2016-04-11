package iterators;

public class Test
{
	public static void main(String args[])
	{
		/*Iterator1 it = new Iterator1(3, 4, 100);
		it.first();
		while(it.hasNext())
		{
			System.out.println(it.current());
			it.next();
		}*/
		System.out.println("Po przejsciu 1szego iteratora:");
		int a = 0;
		Iterator1 it1 = new Iterator1(3, 4, 50);
		it1.first();
		while(it1.hasNext())
		{
			System.out.println(it1.current());
			a++;
			it1.next();
		}
		
		int[] arr1 = new int[a];
		it1.first();
		for(int i = 0; it1.hasNext(); i++, it1.next())
		{
			arr1[i] = it1.current();
		}
		
		System.out.println("\nPo przejsciu 2giego iteratora:");
		Iterator2 it2 = new Iterator2(arr1);
		
		a = 0;
		
		it2.first();
		while(it2.hasNext())
		{
			System.out.println(it2.current());
			a++;
			it2.next();
		}
		if(it2.current()%2 == 0)
		{
			System.out.println(it2.current());
			a++;
		}
		
		int[] arr2 = new int[a];
		
		it2.first();
		int i = 0;
		for(; it2.hasNext(); i++, it2.next())
		{
			arr2[i] = it2.current();
		}
		if(it2.current()%2 == 0)
			arr2[i] = it2.current();
		
		
		System.out.println("\nPo przejsciu 3ciego iteratora:");
		Iterator3 it3 = new Iterator3(arr2, 4);
		
		it3.first();
		while(it3.hasNext())
		{
			it3.next();
		}
		
		it3.first();
		while(it3.hasNext())
		{
			System.out.println(it3.current());
			it3.next();
		}
		
		/*int a = 0;
		int[] g = {0,2,6,7,15,20,22};
		Iterator2 it = new Iterator2(g);
		
		it.first();
		while(it.hasNext())
		{
			System.out.println(it.current());
			it.next();
		}
		
		it.first();
		while(it.hasNext())
		{
			System.out.println(it.current());
			it.next();
		}
		System.out.println(it.current());
		
		int[] z = new int[a];
		it.first();
		
		int d = 0;
		while(it.hasNext()&&d<a-1)
		{
			d++;
			it.next();
			z[d] = it.current();
			
		}
		
			
			
		
		for(int i = 0; i<a; i++)
			System.out.println(z[i]);*/
		
	}
}
