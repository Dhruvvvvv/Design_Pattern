package second.com.structural2.Bridge_design_pattern;

public class Queue<T> implements FifoCollection<T> {
	private LinkedList<T> list;
	public Queue(LinkedList<T> list) {
		this.list=list;
	}

	@Override
	public void offer(T e) {
		 list.addFirst(e);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}

}
