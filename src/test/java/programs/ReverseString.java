package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Akshay is very cool";
		String []b= a.split(" ");
		    List<String> c  = Arrays.asList(b);
		    for(int i=3;i>0;i--) 
		    {
		    System.out.println(c.get(i) );	
		    }
		    
	}

}
