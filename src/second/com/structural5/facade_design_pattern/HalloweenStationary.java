package second.com.structural5.facade_design_pattern;

public class HalloweenStationary implements Stationary {
	@Override
	public String getHeader() {
		return "It's Halloween!!";
	}

	@Override
	public String getFooter() {
		return "BUY MORE STUFF! It's Halloween, c'mon!!";
	}

}
