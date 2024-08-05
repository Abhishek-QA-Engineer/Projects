package DemoPackage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
public class streamJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method -1
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Abhishek");
//		names.add("Akanshu");
//		names.add("Anuj");
//		names.add("vinam");
//		names.add("Non");
//		int count =0;
//		for(int i=0;i<names.size();i++)
//		{
//			String actual = names.get(i);
//			if(actual.startsWith("A"))
//			{
//				count++;
//				
//			}
//		}
//		System.out.println(count);
		
		// above is the basic way to filter name start with letter A but we can filter names like that using java stream project in a very simple and short code
		// for that we have to convert out project into java stream using method "stream()" 
//		Method -2	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Akanshu");
		names.add("Anuj");
		names.add("vinam");
		names.add("Nonu");
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
//		Method -3
		long d = Stream.of("Abhishek","Akanshu","Anuj","vinam","Nonu").filter(s->
	   {
		
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// print names having size greater than 4
//	    names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		// print only one name having size greater than 4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		// now we will use map() to print names ends with "a" letter and with UpperCase
		
		Stream.of("Abhishek","Akansha","Anuj","vinam","Nonu").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// print names have first letter as "A" with UpperCase and sorted
	    List<String>	 name =  Arrays.asList("Abhishek","Anuj","Akansha","Vikram","Azar");
	    name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	   // merging of two different list 
	   Stream<String> newStream =  Stream.concat(names.stream(), name.stream());
	//  newStream.sorted().forEach(s->System.out.println(s));
	  // if we want to check for any specific name that is present in the list or not if present then print that or if not then assert test will fail
	   boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Vinam"));
	   System.out.println(flag);
	   Assert.assertTrue(flag); 
	   
	   // now we are going to use collect
	   List<String> ls= Stream.of("Abhisheka","Akansha","Anuj","vinam","Nonu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	   .collect(Collectors.toList());
	   System.out.println(ls.get(0));
	   
	    List<Integer> values= Arrays.asList(2,3,3,4,5,7);
	    // print unique values from above array
//      values.stream().distinct().forEach(s->System.out.println(s));
	    // sort the above values and print any specific values given
	    List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(li.get(2));  
	    
	   
	   
	 
	 
		
		}
	
}



	


