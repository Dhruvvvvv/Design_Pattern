package first.com.creational5.abstract_factory_pattern;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class PC extends Computer {
	private String ram, cpu, hdd;

	public PC(String ram, String hdd, String cpu) {
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
		return "PC [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}

}
