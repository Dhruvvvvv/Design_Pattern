package first.com.creational2.builder_pattern;

public class Builder2_Imperfect_Builder1 {
	public static void main(String[] args) {
		JavaBeans lunch = new JavaBeans();
		lunch.setBev("Pappu");
		lunch.setRice("Basmati");
		lunch.setPickle("Mango-Pickle");
		lunch.setBox(3);

		System.out.println(lunch.getBev());
		System.out.println(lunch.getRice());
		System.out.println(lunch.getPickle());
		System.out.println(lunch.getBox());

	}
}

class JavaBeans {
	private String bev;
	private String rice;
	private String pickle;
	private int box;

	// 1st Problem with this example is we r using no-args consturctor and we a
	// only one lunch order.

	// 2nd problem it's not immutable, we can change after creating lunch bcoz we hv
	// setters.
	public JavaBeans() {

	}

	public String getBev() {
		return bev;
	}

	public void setBev(String bev) {
		this.bev = bev;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getPickle() {
		return pickle;
	}

	public void setPickle(String pickle) {
		this.pickle = pickle;
	}

	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}

}
