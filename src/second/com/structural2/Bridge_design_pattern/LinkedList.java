package second.com.structural2.Bridge_design_pattern;

public interface LinkedList<T> {
	
	void addFirst(T e);
	T removeFirst();
	T removeLast();
	void addLast(T e);
	int getSize();
	

}
