package coreJava;

import java.util.HashMap;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		 String str="Welcome to Java";
		 
		 //convert string to char arry
		 
		char[] ch=str.toCharArray();

		// System.out.println(ch);
		 
		 HashMap<Character, Integer> hm=new HashMap();
		for(char c:ch)
		{ 
			//System.out.println(c);
			if(hm.containsKey(c))
				{
				hm.put(c,hm.get(c)+1);
				System.out.println(hm);
				}else{
					hm.put(c,1);
					System.out.println(hm);
				}
		}






	}

}
