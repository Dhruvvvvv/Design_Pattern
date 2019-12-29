package second.com.structural4.Composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

	private List<File> list = new ArrayList<>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.println(getName());
		list.forEach(File::ls);
	}

	@Override
	public void addFile(File file) {
		list.add(file);
	}

	@Override
	public File[] getFiles() {

		return list.toArray(new BinaryFile[list.size()]);
	}

	@Override
	public boolean removeFile(File file) {

		return list.remove(file);
	}
}
