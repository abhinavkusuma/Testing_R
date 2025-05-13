package java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');  
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

//		Size of ArrayList
		System.out.println("Size of an ArrayList : "+mylist.size());
		
//		Printing ArrayList
		System.out.println("Printing data from ArrayList : "+mylist);
		
//		Modify/Replace/Change ArrayList
		mylist.set(7, false);
		System.out.println("Add ArrayList : "+mylist);
		
//		Remove ArrayList
		mylist.remove(5);
		System.out.println("After Removing ArrayList :"+mylist);
		
//		Insert Element in ArrayList
		mylist.add(2, "Java");
		System.out.println("Insert Element :"+mylist);
		
//		Access Specific Element from ArrayList
		System.out.println(mylist.get(2));
		
//		Using For Loop in ArrayList
//		for(int i=0;i<mylist.size();i++) {
//			System.out.println(mylist.get(i));
//		}
		
//		Using For Each Loop in ArrayList
//		for(Object x : mylist) {
//			System.out.println(x);
//		}
		
//		Using Iterator in ArrayList
//		Iterator it = mylist.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Check ArrayList is Empty or Not
		System.out.println("Is Empty ArrayList :"+mylist.isEmpty());
		
//		Remove Particular Element from ArrayList
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		mylist.removeAll(mylist2);
		System.out.println("After Removing Multiple Elements From ArrayList :"+mylist);
		
//		Remove All Elements/Clear From ArrayList
		mylist.clear();
		System.out.println("Is Empty ArrayList :"+mylist.isEmpty());
	}
}