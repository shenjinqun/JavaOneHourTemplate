package jackie.learn.daily;

import java.util.ArrayList;
import java.util.List;


/**
 * 接收客户端传来的学生对象集合，依次实现门面模式 观察者模式 代理模式  自定义注解
 * @author Jackie.Shen
 */
//TODO 设置注解， 启用JUMP方式


public class ServerMain {

	public static List<IStudent<Number>> studentList = new ArrayList<IStudent<Number>>();

	public static void main(String[] args) throws Exception {

		//BIO方式实现网络传输, 取消注释后， 可以用于调试网络传输情况
		//	ServerSocket serverSocket = new ServerSocket(5000);
		//	Socket accept = serverSocket.accept();
		//	InputStream inputStream = accept.getInputStream();
		//	ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		//	Object readObject = objectInputStream.readObject();
		//	System.out.println(readObject);

		/*TODO 1.调用线程 ReceiveInfoThread
		       2.等待线程执行结束后，调用parseStudent */


	}
	
	public static void parseStudent( IStudent<Number> student) {
		//TODO 门面模式演示, 调用student 和 teacher 的 setName 方法


		//TODO 观察者模式演示, 调用 getPassword方法
		
		
		//TODO 代理模式演示， 调用 setPassword, 并且将密码设置为 “123”
		
		
		//TODO 自定义注解演示, 调用 setId 方法
		
		
	}
}

/**
 * 通多继承的方式实现线程功能, 通过 NIO 的方式接受客户端传来的消息
 * @author Jackie.Shen
 */
class ReceiveInfoThread extends Thread {
	/* TODO 重写 Thread类中的run方法
	  		通过NIO方式接受消息，将接受的消息赋值给  ServerMain.studentList
	       	服务器端口设置为 :5000  */


}