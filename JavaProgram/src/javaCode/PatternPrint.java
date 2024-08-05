package javaCode;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print triangle pattern
/*		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}   */
		
// to print reverse pattern
/*		for(int i=5;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}    */
		
// Print Number Triangle 
		
/*		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.print('\n');
		}   */
		
// print pyramid 
		
		for(int i=5;i>0;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
		}
			System.out.print('\n');
		}

	}

}
