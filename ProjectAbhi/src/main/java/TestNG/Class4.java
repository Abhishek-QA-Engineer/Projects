package TestNG;

import org.testng.annotations.Test;
// Inheritance >> with the help of inheritance we can access the method and variable of parent class in child class by using keyword "extends"
// If we are using inheritance then we can directly call the methods of parent class means we do not need to create an object of that class
// In the below code >class3 is our parent class having method "doThis" and here in class4 we are calling this method as class4 is the child class 
public class Class4 extends Class3 {
	
	@Test
	public void testRun()
	{
		// here we want to increment and decrement the value of a by calling the method of class5 with the of object of that class5
		// here we need to create an constructor for class -class5 do that we can send our current value of a while calling 
		// Constructor >>> To perform initialization of any object a constructor is needed.
		// now if we want to perform multiply operation but it should be in another class and calling should be only one time 
		// here we will use "super keyword" >>> it will  help us to invoke parent class constructor  
		// super keyword will be usable only when the inheritance occurred
		// Remember that super keyword should be declare in first line with in the constructor according to java rule
		Class5 c5 = new Class5(3); // parameterized constructor
		int a =3;
		doThis();
		System.out.println(c5.increment());
		System.out.println(c5.decrement());        
		
		// if we have a requirement like we should call only one time in class4 but we have to perform multiply operation as well 
		// then we need inheritance to achieve that then we can comment below calling line for class6
//		Class6 c6 = new Class6(3);
		System.out.println(c5.multiply());
		
	}
	

}
