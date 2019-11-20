package coreJava;

import java.util.HashMap;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ALL THE BEST";
		
		//convert string to char arry
		
		char[] stringtochar=str.toCharArray();
		
		System.out.println(stringtochar);
		//to generate key value format used hashmap
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		//iterate earch char and verify
		
		for(char ch:stringtochar)
		{
			//if ch is present from listed stried
			if(hm.containsKey(ch))
			{
				//put it in map and increment
				hm.put(ch, hm.get(ch)+1);
			}else{
				//else give 1 value to key
				hm.put(ch, 1);
			}
		}
		
		//display output
		System.out.println(hm);
			
/*	//Duplicate occurence of each string:
 *      	 
		//Creating a HashMap containing char as key and it's occurrences as value
		 * 
	
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Getting a Set containing all keys of charCountMap
 
        Set<Character> charsInString = charCountMap.keySet();
 
        System.out.println("Duplicate Characters In "+inputString);
 
        //Iterating through Set 'charsInString'
 
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
 
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }*/
		
		/*Reverse each word:
			String[] words = inputString.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
		*/
		//Reverse the string
	/*	StringBuffer sbf = new StringBuffer("MyJava");

		System.out.println(sbf.reverse());    //Output : avaJyM
		or 
		String str = "MyJava";
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     //Output : avaJyM
		}*/
		//how to remove white spaces
		/* Scanner sc = new Scanner(System.in);
         
	        System.out.println("Enter input string to be cleaned from white spaces...!");
	         
	        String inputString = sc.nextLine();
	         
	        char[] charArray = inputString.toCharArray();
	         
	        String stringWithoutSpaces = "";
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') &amp;&amp; (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
	            }
	        }
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
	         
	        sc.close();*/
		
	/*	Java Program To Convert Integer To String Using Integer.toString() Method :


			public class IntegerToString
			{
			    public static void main(String[] args) 
			    {
			        int i = 2015;
			         
			        String s = Integer.toString(i);
			         
			        System.out.println(s);     //Output : 2015
			    }
			}
			Java Program To Convert Integer To String Using String.valueOf() method :


			public class IntegerToString
			{
			    public static void main(String[] args) 
			    {
			        int i = 2015;
			         
			        String s = String.valueOf(i);
			         
			        System.out.println(s);     //Output : 2015
			    }
			}
		*/
	}
}
	

