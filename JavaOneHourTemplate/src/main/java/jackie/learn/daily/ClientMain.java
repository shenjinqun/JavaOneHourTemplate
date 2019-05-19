package jackie.learn.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 启用线程池，分三个线程，初始化 1-6号学生
 * @author Jackie.Shen
 */
public class ClientMain {

	public static IStudent<Number> student;
	public static List<IStudent<Number>> studentList = new ArrayList<IStudent<Number>>();
	public static volatile boolean completed = false;

	//TODO 静态代码块，初始化学生类, 学号：1， 姓名：zhangsan， 密码：123456


	public static void main(String[] args) throws Exception {
		//TODO 利用CountdownLatch类和线程方式，判断初始化学生的三个线程是否结束

		
		 //TODO 在线程池初始化学生

		
		 //TODO 线程等待, 等待countDownLatch对象计数归零
		

		 //TODO 主控台输出 studentList 对象


		 //TODO 利用策略模式，对学生对象集合进行倒序排序

		
		//演示代码，取消注释后，可以发送Object 到服务器端
		//  ObjectOutputStream oos = new ObjectOutputStream(new Socket("localhost", 5000).getOutputStream());
		//  oos.writeObject(studentList);
		
		 //TODO 实现网络客户端 发送学生对象集合到服务器端, 设置端口号为：5000


	}
}

/**
 * 在线程中实现1-6号学生的初始化， 第一个线程初始化1、4号学生， 第二个线程初始 2、5号学生， 第三个线程初始化3、6号学生
 * @author Jackie.Shen
 */
//TODO 通过实现接口的方式支持多线程 
class StudentThread {
	int mode;
	IStudent<Number> student;

	public StudentThread(int mode, IStudent<Number> student) {
		this.mode = mode;
		this.student = student;
	}

	/*TODO 1.线程接口中必须实现的方法, 通过 synchronized wait notifyAll 等控制线程顺序执行
	       2.如果是第三个线程，循环退出后， 标记completed状态为 true； */


}

/**
 * 通过深克隆，生成新的学生对象
 * @author Jackie.Shen
 */
class StudentProcess {
	public static IStudent<Number> addStudent(IStudent<Number> student) {
		try {
			@SuppressWarnings("unchecked")
			IStudent<Number> s = (IStudent<Number>) student.clone();
			int id = ClientMain.studentList.size() + 1;
			s.setId(id);
			s.setName("xm_" + id);
			s.setPassword("mm_" + id);
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}