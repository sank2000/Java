class Maximum
{
	 <S extends Comparable<S>> void max(S[] elem)
	{
		 
		S max=elem[0];
		for(int i=1;i<elem.length;i++)
		{
			if(elem[i].compareTo(max)>0)
			{
				max = elem[i];
			}
		}
		System.out.println("The maximum element is : "+max);
	}
}
public class Genericfunction 
{
	public static void main(String[] args)
	{
		Maximum m=new Maximum();
		Integer[] i= {13,53,78,98};
		Double[] d= {23.5,67.3,89.9,32.6};
		Character[] c= {'c','q','r','h','a','k','o'};
		String[] s= {"san","vel","regina",};
		m.max(i);
		m.max(d);
		m.max(c);
		m.max(s);
	}
	
	
}
