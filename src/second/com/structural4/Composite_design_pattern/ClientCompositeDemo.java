package second.com.structural4.Composite_design_pattern;

public class ClientCompositeDemo {

	public static void main(String[] args) {
		File root = createOneTree();
		root.ls();

	}

	public static File createOneTree() {
		Directory dir = new Directory("Dir");
		BinaryFile b1 = new BinaryFile("File1", 100);
		dir.addFile(b1);
		BinaryFile b2 = new BinaryFile("File2", 200);
		BinaryFile b3 = new BinaryFile("File3", 300);
		Directory dir1 = new Directory("Dir1");
		dir1.addFile(dir);
		dir1.addFile(b2);
		dir1.addFile(b3);
		return dir1;
	}

}
