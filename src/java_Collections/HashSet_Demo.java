package java_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet myset = new HashSet();
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(null);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		
//		Printing HashSet
		System.out.println("Printing Data From HashSet:"+myset);
		
//		Size of HashSet
		myset.size();
		System.out.println("Size of HashSet :"+myset.size());
		
//		Removing Elements
		myset.remove(100);
		System.out.println("After Removing Element :"+myset);
		
//		Inserting Element - Not Possible
		
//		Access Specific Element - Not Possible
		
//		Convert HashSet to ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
//		Reading All Elements Using For...Each Loop
		for(Object x : myset) {
			System.out.println(x);
		}
		
//		Using Iterator 
		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Clearing All Elements in HashSet
		myset.clear();
		System.out.println(myset.isEmpty());
	}
}
