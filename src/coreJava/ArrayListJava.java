package coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListJava {
	public static void main(String[] args){
		
		/* diff ways of creating arraylist
		
		List<Integer> list1=new ArrayList<Integer>();
		List<String> list2=new ArrayList<String>(list);
		List<String> list3=new ArrayList<String>(20);
		*/
		ArrayList list2=new ArrayList();
		list2.add(200);
		list2.add("list2 adding into al");
		
		
	ArrayList<Object> al=new ArrayList<Object>();
	 ArrayList list=new ArrayList();
	 System.out.println(list);//[]
	
	al.add("100");

	al.add(200);
	al.add('A');
	al.add('%');
	al.add(200);//duplicates will allow and display[100, 200, A, %, 200, null]
	al.add(null);//null allow and display
	//System.out.println(al);
//to print elements in descending order	
	
/*	Iterator<String> it=al.descendingIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
*/
/*	how do u join arraylist to linkedlist, 
	linkedList.addAll(arrayList);*/
/*	adding 2 arraylists
	System.out.println(al.addAll(list));//since nothing is there in list displays false
	*/
	
	//to retrive protion of elements but not all
	//System.out.println(al.subList(1, 4));
	
	//Inserting all elements of list2 at index 2 of al
	System.out.println(al.addAll(2, list2));
	System.out.println(al);
	
	//Convert ArrayList to Array
	/*Object[] array=al.toArray();
	System.out.println(array);//[Ljava.lang.Object;@15db9742
	for(Object obj:array)
	{
		System.out.println(obj);
	}*/
//adding element by not removing existing element
	
	/*al.add(1, "addelement");
	System.out.println(al);//[100, addelement, 200, A, %, 200, null]
	*/
	//usage of all methods
	/*System.out.println(al);
	System.out.println(al.getClass());//class java.util.ArrayList
	System.out.println(al.get(3));//%

    System.out.println(al.contains(200));//true
    System.out.println(al.equals(200));//false
    
    System.out.println(al.hashCode());//1597249524
   //System.out.println(al.remove(2));//A removed
    * System.out.println(al.remove("100"))
    * System.out.println(al.clear());//to remove all
    System.out.println(al.size());//aftre removal size 5 but total 6
    
  System.out.println(al.indexOf(200));//1
   /to get the index of last occurence
     System.out.println(al.lastIndexOf(200));
     
 How do you replace a particular element in an ArrayList with the given element?
    System.out.println(al.set(2, "test"));//it replace with new value on index 2
    System.out.println(al);
    
    System.out.println(al.get(2));//test will display
*/    

    
    //Arraylist default capacit is 10 but automatically increases, if u want to increase manually then al.ensureCapacity(20); like this can increase
    

    //reducing the current capacity to current size of an ArrayList, al.trimToSize();







}
}