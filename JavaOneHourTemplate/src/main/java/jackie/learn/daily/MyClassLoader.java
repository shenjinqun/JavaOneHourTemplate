package jackie.learn.daily;

import java.io.FileInputStream;

/**
 * 简单的自定义类加载器
 * @author Jackie.Shen
 */
//TODO 集成JDK中的抽象类
public class MyClassLoader {

	private FileInputStream fileInputStream;

	/* TODO 重写加载类的指定方法 
	                    读取指定目录下的 .class文件,转换为字节数组
	                     调用类生成函数，创建class对象 */


	//简单的main方法用于测试, 取消注释即可
	public static void main(String[] args) throws Exception {
			MyClassLoader myClassLoader = new MyClassLoader();
		//	myClassLoader.findClass("jackie.learn.daily.Teacher");
		//	Class<?> findClass = myClassLoader.findClass("jackie.learn.daily.Student");
		//	findClass.newInstance();
	}
}