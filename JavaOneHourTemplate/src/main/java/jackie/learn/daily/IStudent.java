package jackie.learn.daily;

/**
 * 实现了适配器模式的接口对象
 * @author Jackie.Shen
 */
public interface IStudent<T extends Number> {

	T getId();

	void setId(T id);

	String getName();

	void setName(String name);

	String getPassword();

	void setPassword(String password);

	Teacher getTeacher();

	void setTeacher(Teacher teacher);

	String toString();

	//定义clone方法，支持对接口的调用
	public Object clone() throws CloneNotSupportedException ;
	
	//TODO 引入观察者模式中的函数定义
	

}