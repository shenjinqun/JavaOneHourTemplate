package jackie.learn.daily;

/**
 * 实现一个简单的注解, 在 Student类的 setId 方法内进行实际控制
 * @author Jackie.Shen
 */
/*TODO 1.设置 Target 为 ElementType.TYPE 和 ElementType.METHOD 
       2.设置 Retention 为 RetentionPolicy.RUNTIME */


public @interface MyAnnotation {
 //TODO 定义枚举类型 ProcessType，包括 JUMP和 EXECUTE 两个枚举变量 


 //TODO 定义注解 process,  默认值为 EXECUTE


}