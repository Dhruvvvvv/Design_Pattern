package first.com.creational8.Object_Pool_Design_Pattern;

import com.sun.javafx.geom.Point2D;

public class ClientDemo {
	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bpm"), 5);

	public static void main(String[] args) {

		Bitmap b1 = bitmapPool.get();
		b1.setLocation(new Point2D(10, 10));
		b1.draw();

		bitmapPool.release(b1);

		Bitmap b2 = bitmapPool.get();
		b2.setLocation(new Point2D(110, 0));
		b2.draw();

		bitmapPool.release(b2);

	}

}
