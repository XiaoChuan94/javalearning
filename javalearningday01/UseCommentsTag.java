package javalearningday01;

/**
 * Java注释的使用
 * @author Administrator
 * @date 2018年1月14日
 */
public class UseCommentsTag {

	public static void main(String[] args) {
		/*
		 * 注释方法二
		 * 可以注释多行
		 */
		System.out.println("这是主方法");
	}
	
	/**
	 * 注释方法三
	 * @return String 返回String
	 */
	public String useTag(){
		// 注释方法二，单行注释
		return "这是普通方法";
	}
	
	/**
	 * 这里可以介绍这个方法是干什么的
	 * @param str 参数名，说明传递进来的参数是什么
	 * @return 返回值，说明返回什么样的数据
	 */
	public String useMethod(String str){
		return "Hello"+str;
	}
}
