package java_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Abhinav");
		hm.put(102, "Bhanu");
		hm.put(103, "Sai");
		hm.put(104, "Ganesh");
		hm.put(105, "Sai");
		hm.put(103, "Vishva");
		
//		Printing HashMap
		System.out.println(hm);
		
//		Size of HashMap
		System.out.println("Size of HashMap :"+hm.size());
		
//		Remove Pair
		hm.remove(103);
		System.out.println("After Removing Pair :"+hm);
		
//		Access Value of the Key
		System.out.println(hm.get(101));
		
//		Get All Keys and Values From HashMap
		System.out.println("Keys :"+hm.keySet());
		System.out.println("Values :"+hm.values());
		System.out.println("Keys Along With values :"+hm.entrySet());
		
//		Using For Each Loop
		for(int k : hm.keySet()) {
			System.out.println(k+"   "+hm.get(k));
		}
		
//		Using Iterator
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}
}