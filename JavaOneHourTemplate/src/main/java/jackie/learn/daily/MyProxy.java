package jackie.learn.daily;

/**
 * 利用JDK提供的 InvocationHandler和 Proxy类实现动态代理
 * @author Jackie.Shen
 */
 //TODO 代理类需要实现接口：  InvocationHandler 
public class MyProxy {
	//TODO 定义成员变量 object


	//TODO 定义成员变量初始化的构造函数
	

	/*TODO 定义工厂方法  factory
	                 调用 JVM提供的 Proxy类的 新增实例方法  */
	

	/*TODO 1.定义代理方法 invoke
	       2.主控台输出代理模式触发了
	       3.捕获异常，输入异常消息，不要打印调用轨迹信息    */
	

}
/**
 * 应用观察者模式
 * @author Jackie.Shen
 */
//TODO 实现JDK提供的接口
class MyConsole {
	//TODO 创建info方法，从主控台输出消息


	//TODO 实现接口中的方法, 调用上面的info犯法， 输出字符串“观察者模式触发了"
	
	
}

/**
 * 应用观察者模式, 输出消息到日志 "log.txt"
 * @author Jackie.Shen
 */
class MyLog {
	//TODO 静态代码块，初始化写文件对象


	//TODO 创建info方法，往日志文件台输出消息


	//TODO 实现接口中的方法, 调用上面的info犯法， 输出字符串“观察者模式触发了"
	
	
}