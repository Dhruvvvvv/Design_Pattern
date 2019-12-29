package second.com.structural5.facade_design_pattern;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}

}
