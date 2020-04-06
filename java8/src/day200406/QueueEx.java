package day200406;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("melon");
		q.offer("banana");
		q.offer("apple");

		while (!q.isEmpty()) {
			System.out.println(q.peek());
			String fruit = q.poll();
			System.out.println(fruit);
		}
	}
}
