package CodePractise;

  public class Abhi
   {
	  public void methodOne(int i)
	  {
	  System.out.println("int-arg method");
	  }
	  public void methodOne(float f) //overloaded methods
	  {
	  System.out.println("float-arg method");
	  }
	  public static void main(String[] args)
	  {
	  Abhi t=new Abhi();
//	  t.methodOne('a');//int-arg method
	  t.methodOne(101);//float-arg method
//	  t.methodOne(0.5);//C.E:cannot find symbol
//      t.methodOne(45.6);
   }
	  
   }

