package jackie.learn.daily;
	
import org.junit.Assert;
import org.junit.Test;

import jackie.learn.daily.MyClassLoader;

public class MyClassLoaderTest {

	@Test
	public void testFindClassString() throws ClassNotFoundException {
		MyClassLoader myClassLoader = new MyClassLoader(); 
		Class<?> findClass = myClassLoader.findClass("jackie.learn.daily.Student");
		if( findClass == null ) {
			Assert.fail("error");
		}
	}
}
