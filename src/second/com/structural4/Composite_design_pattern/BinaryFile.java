package second.com.structural4.Composite_design_pattern;

public class BinaryFile extends File{
	
	private String name;
	private long size;
	public BinaryFile(String  name, long size) {
		super(name);
		this.size=size;
		
	}
	
	@Override
	public void ls() {
		System.out.println(getName()+"\t"+size);
	}

	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("File dosn't support this function.");	
	}


	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("File dosn't support this function.");	
	}


	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("File dosn't support this function.");
	}

}
