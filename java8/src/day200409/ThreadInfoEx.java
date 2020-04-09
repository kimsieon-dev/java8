package day200409;

import java.util.Map;
import java.util.Set;

public class ThreadInfoEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // 데몬 스레드의 AutoSvaThread 클래스
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true); // start 전에 setDaemon 해야한다.
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + ((thread.isDaemon())?"(데몬)" : "(주)"));
			System.out.println("\t" + "소속그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
