package jackie.learn.daily;

import java.io.Serializable;

/**
 * 创建学生对象
 * @author Jackie.Shen
 */
//TODO 继承观察者类, 实现 克隆接口  序列号接口  学生接口  门面模式接口
public class Student{
/* TODO 1.成员变量包括  泛型 id， name,  password,  teacher对象
 		2.为Student类定义空构造方法
 		3.定义初始化成员变量的构造方法( id、name、password )
		4.在 setId 方法内实现注解的应用，如果在调用类上配置为 JUMP, 则不修改ID
		5.在 getPassword 方法上应用观察者模式
		6.在 setPassword 上判断密码是否太简单，抛出自定义异常， “密码太简单了"
		7.实现深克隆
		8.实现 toString 方法 */


}

/**
 * 创建教师对象
 * @author Jackie.Shen
 */
class Teacher implements Cloneable, Serializable,INameFacade {
/* TODO 1.成员变量包括  id， name,  password, subject 
		2.在 setName 方法内输出主控台消息："门面模式触发了" 
		3.实现克隆
		4.实现 toString 方法  */
	
	
}

/**
 * 实现简单的策略模式 
 * @author Jackie.Shen
 */
//TODO 实现Comparator接口
class DescStrategy {
	//TODO 实现接口内的方法 输出倒序规则
	

}