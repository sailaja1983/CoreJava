
/*ClassCastException is also such an exception which happens only at run time. It occurs when data of one type can not be casted to another type.
 *  You will never get a single clue about this exception during compilation. Look at the below code which throws ClassCastException at run time.
 *   But, you will never be get notified about this exception at compile time.*/
package coreJava;

import java.util.ArrayList;

public class Genarics {
	public static void main(String args[])
	{
		        ArrayList list = new ArrayList();
		 
		        list.add("JAVA");
		 
		        list.add(123);
		 
		        for (Object object : list)
		        {
		            //Below statement throws ClassCastException at run time
		 
		            String str = (String) object;       //Type casting
		 
		            System.out.println(str);
		        }
		        
		       
		        
	}
	 private int main(int a)
     {
		 return a;
     }

}
