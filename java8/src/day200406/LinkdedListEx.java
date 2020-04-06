package day200406;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdedListEx {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		System.out.println("ArrayList¿Í LinkedList ºñ±³");
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++) {
			arrayList.add(String.valueOf(i));
		}

		long end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++) {
			arrayList.add(String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList : " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10_000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10_000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList : " + (end - start) + " ms");
	}
}
