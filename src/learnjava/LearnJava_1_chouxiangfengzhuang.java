/**   
  * 功能描述：学习Java之类与对象，抽象、封装
 * @Package: learnjava 
 * @author: 王某某
 * @date: 2018年11月7日 下午9:41:58 
 */
package learnjava;//包名一般小写

/**
* @ClassName: LearnJava_1_chouxiangfengzhuang.java
* @Description: 学习Java之类与对象，抽象、封装.
*
* @version: v1.0.0
* @author: 王某某
* @date: 2018年11月7日 下午9:41:58 
*/
public class LearnJava_1_chouxiangfengzhuang {	//一个Java文件中有且只有一个被public修饰的类，且类名与文件名相同
	public static void main(String ages[]) {
		User user_1 = new User();				//通过一个无参构造函数实例化了一个名为user_1的User类的对象
		user_1.setId(0);						//通过setId()方法给user_1对象中的id属性赋值为0
		user_1.setUserName("二狗子");			//通过setUserName()方法给user_1对象中的username属性赋值为二狗子
		user_1.setPassWord("ergouzi");			//通过setPassWord()方法给user_1对象中的password属性赋值为ergouzi
		user_1.setAge(16);						//通过setAge()方法给user_1对象中的age属性赋值为16
		String user_1_str= user_1.toString();	//通过toString()方法获取user_1对象中的所有属性信息
		System.out.println(user_1_str);			//打印user_1对象中的所有属性信息
		System.out.println(user_1.id);			//直接访问user_1对象中的公有属性
		//System.out.println(user_1.username);	//直接访问user_1对象中的私有属性，语法错误，因为在类的外部，无法通过实例化的对象来访问私有成员变量
		//通过get方法获取user_1对象中的属性信息
		System.out.println(user_1.getId() + "," 
						 + user_1.getUserName() + "," 
						 + user_1.getPassWord() + "," 
						 + user_1.getAge());
		boolean flag;
		flag = user_1.verification("二狗子", "ergouzi");		//通过verification()方法验证用户名和密码
		verification(flag);								 	//通过verification()方法查看验证结果
		flag = user_1.verification("二狗子", "er");		 	//通过verification()方法验证用户名和密码4
		verification(flag);								 	//通过verification()方法查看验证结果

		User user_2 = new User(0, "大狗子", "dagouzi", 18);//通过一个有参构造函数实例化了一个名为user_2的User类的对象
														  //并且初始化属性 其中 
														  //id = 0 
														  //username = “大狗子” 
														  //password = “dagouzi” 
														  //age = 18
		String user_2_str= user_2.toString();	//通过toString()方法获取user_2对象中的所有属性信息
		System.out.println(user_2_str);			//打印user_2对象中的所有属性信息
		
		
	}
	private static void verification(boolean flag) {
		if(flag) {
			System.out.println(flag + "验证成功");
		}else {
			System.out.println(flag + "验证失败");
		}
	}

}
/**
 * 
* @ClassName: User
* @Description: 对用户类的抽象、封装及访问修饰符的使用
*
* @version: v1.0.0
* @author: 王某某
* @date: 2018年11月7日 下午9:45:28
 */
class User {
	/**
	 * 用户编号
	 */
	public int id;//属性一般小写
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户年龄
	 */
	private int age;
	/**
	 * 
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: 无参构造函数
	*
	* @param:无参数
	* @version: v1.0.0
	* @author: 王某某
	* @date: 2018年11月7日 下午9:56:37
	 */
	public User() {
		
	}
	/**
	 * 
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: 有参构造器，实例化时初始化对象内的属性
	*
	* @param:id       -> 用户编号
			 username -> 用户名
			 password -> 用户密码
			 age      -> 用户年龄
	* @version: v1.0.0
	* @author: 王某某
	* @date: 2018年11月7日 下午10:05:07
	 */
	public User(int id, String username, String password, int age) {  
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	/**
	 * 
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: 验证用户用户名与密码
	*
	* @param:username -> 用户名
			 password -> 用户密码
	* @return：用户名与密码若与对象中保存用户名与密码一致返回True否则返回False
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 王某某
	* @date: 2018年11月7日 下午10:07:35
	 */
	public boolean verification(String username, String password) {
		boolean flag = false;
		if(username == this.username || password == this.password)
		{
			flag = true;
		}else
		{
			flag = false;
		}
		return flag;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUserName() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUserName(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassWord() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassWord(String password) {
		this.password = password;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/** 
	* @see java.lang.Object#toString()  
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: 重写toString()方法
	*
	* @param:无参数
	* @return：返回用户信息
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 王某某
	* @date: 2018年11月7日 下午9:51:45 
	*/
	@Override
	public String toString() {
		String re;
		re = "ID:		 " + this.getId()
		   + "\nUser Name:	" + this.getUserName()
		   + "\nPassword:	" + this.getPassWord()
		   + "\nage:		" + this.getAge();
		return re;
	}
	
	

}
