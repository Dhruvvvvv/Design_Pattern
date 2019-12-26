package first.com.creational2.builder_pattern;

public class Builder1_StringBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		// StringBuilder is exmaple of Builder pattern it can append any object.
		builder.append("This is an example ");
		builder.append("builder pattern .");
		builder.append("It has methods to append");
		builder.append("almost everything that we want to a String");
		builder.append(50);

		System.out.println(builder.toString());
		// w/o cancat or + we perform append. It's high performant than
		// StringBuufer(synchronized class).

	}

}
