package first.com.creational1.singleton_pattern;

class Synch{
	public void dis() {
		System.out.println("Non- synch method "+Thread.currentThread().getName());
	}
	public synchronized void view() {
		//synchronized (this) {
			System.out.println("Synchronized method"+Thread.currentThread().getName());	
		//}
		
	}
	public synchronized static  void watch() throws InterruptedException {
		//synchronized (Synch.class) {
			System.out.println("Class- level "+Thread.currentThread().getName());
			Thread.sleep(10000);
		//}
		
	}
}

public class ObjectLock extends Thread{
	@Override
	public void run() {
//		try {
//			Synch.watch();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("I'm trying to call the synch"+Thread.currentThread().getName());
		Synch syn = new Synch();
		System.out.println("I've constructed synch"+Thread.currentThread().getName());
		syn.dis();
		System.out.println("I've called display"+Thread.currentThread().getName());
		syn.view();
		System.out.println("I've called view"+Thread.currentThread().getName());
	}
}

class ClassLock extends Thread{
	@Override
	public void run() {
		try {
			
			System.out.println("I've acquired lock at class level");
			Synch.watch();
			System.out.println("I've released the class lock after 10000 milliseconds");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MainTesterClass {
	public static void main(String[] args) {
		ObjectLock objLock = new ObjectLock();
		ClassLock classLock = new ClassLock();
		classLock.start();
		objLock.start();
	}
}
