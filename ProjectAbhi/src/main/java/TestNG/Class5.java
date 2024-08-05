package TestNG;

public class Class5 extends Class6 {
	int a;
	
	public Class5(int a)
	{
		super (a); // must be declare in the first line with in the constructor
		this.a=a;
	}
	
	public int increment()
	{
		a =a+1;
		return a;
	}
	public int decrement()
	{
		a =a-1;
		return a;
	}

}
