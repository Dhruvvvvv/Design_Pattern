package second.com.structural2.Bridge_design_pattern;

public class SingleLinkedList<T> implements LinkedList<T> {
	
	private class Node{
		private Object data;
		private Node next;
		private Node(Object data, Node next) {
			this.data=data;
			this.next=next;
		}
	}
	
	private Node top, last;
	private int size;
	
	@Override
	public void addFirst(T e) {
		if(top==null) {
			last=top=new Node(e,null);
		}else {
			top= new Node(e, top);
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if(top==null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T temp = (T)top.data;
		if(top.next!=null) {
			top= top.next;
		}else {
		top= null;
		last=null;
		}
		size--;
		return temp;	
	}

	@Override
	public T removeLast() {
		return null;
		//System.out.println("Coming soon.....");
		
	}

	@Override
	public void addLast(T e) {
		if(last==null) {
			top= new Node(e , null);
		}else {
			last=new Node(e, null);
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
