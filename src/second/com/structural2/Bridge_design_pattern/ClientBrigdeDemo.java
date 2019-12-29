package second.com.structural2.Bridge_design_pattern;

public class ClientBrigdeDemo {

	public static void main(String[] args) {

		FifoCollection<Integer> c = new Queue<Integer>(new SingleLinkedList<>());
	    c.offer(99);
		c.offer(300);
		c.offer(234);
	    System.out.println(c.poll());
	    System.out.println(c.poll());
	   System.out.println(c.poll());
		
		
		
		
		
		
	}

}
