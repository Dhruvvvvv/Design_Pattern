package first.com.creational8.Object_Pool_Design_Pattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
	private BlockingQueue<T> availablePool;
	private AtomicInteger count;

	public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingQueue<>();
		for (int i = 0; i < count; i++) {
			availablePool.offer(creator.get());

		}

	}

	public T get() {

		try {
			return availablePool.take();
		} catch (InterruptedException e) {
			System.err.println("take() was interrupted.");
		}
		return null;
	}

	public void release(T obj) {

		obj.reset();
		try {
			availablePool.put(obj);
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted..!");
			e.printStackTrace();
		}

	}

}
