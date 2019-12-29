package second.com.structural8.dynamic_proxy_design_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javafx.geometry.Point2D;

public class ImageInvocationHandler implements InvocationHandler {

	private String filename;
	private Point2D location;
	private Bitmap image;
	private static final Method setLocation;
	private static final Method getLocation;
	private static final Method renderMethod;

	// Cache Methods for later comparison
	static {
		try {
			setLocation = Image.class.getMethod("setLocation", new Class[] { Point2D.class });
			getLocation = Image.class.getMethod("getLocation", null);
			renderMethod = Image.class.getMethod("render", null);
		} catch (NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}

	public ImageInvocationHandler(String filename) {
		this.filename = filename;
	}

	// This method is called for every method invocation on the proxy
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("Inoking method:: " + method.getName());
		if (method.equals(setLocation)) {
			return handleSetLocation(args);
		} else if (method.equals(getLocation)) {
			return handleGetLocation();
		} else if (method.equals(renderMethod)) {
			return handleRender();
		}
		return null;
	}
	
	// We create real object only when we really need it
		private Object handleRender() {
			if (image == null) {
				image = new Bitmap(filename);
				if(location!=null) {
					image.setLocation(location);
				}
			}
			image.render();
			return null;
		}
		
		
		private Point2D handleGetLocation() {
			if(image!=null) {
				return image.getLocation();
			}else {
			return this.location;
			}
		}
		
		
		

	private Object handleSetLocation(Object[] args) {
		if(image!=null) {
			 image.setLocation((Point2D)args[0]);
		}else {
			this.location= (Point2D) args[0];
		}
		return null;
	}

	
	

	
	

}
