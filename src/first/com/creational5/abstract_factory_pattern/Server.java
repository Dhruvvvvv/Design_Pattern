package first.com.creational5.abstract_factory_pattern;

public class Server extends Computer {
	private String ram, cpu, hdd;

	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}

}
