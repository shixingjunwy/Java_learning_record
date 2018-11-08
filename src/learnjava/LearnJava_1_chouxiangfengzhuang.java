/**   
  * ����������ѧϰJava֮������󣬳��󡢷�װ
 * @Package: learnjava 
 * @author: ��ĳĳ
 * @date: 2018��11��7�� ����9:41:58 
 */
package learnjava;//����һ��Сд

/**
* @ClassName: LearnJava_1_chouxiangfengzhuang.java
* @Description: ѧϰJava֮������󣬳��󡢷�װ.
*
* @version: v1.0.0
* @author: ��ĳĳ
* @date: 2018��11��7�� ����9:41:58 
*/
public class LearnJava_1_chouxiangfengzhuang {	//һ��Java�ļ�������ֻ��һ����public���ε��࣬���������ļ�����ͬ
	public static void main(String ages[]) {
		User user_1 = new User();				//ͨ��һ���޲ι��캯��ʵ������һ����Ϊuser_1��User��Ķ���
		user_1.setId(0);						//ͨ��setId()������user_1�����е�id���Ը�ֵΪ0
		user_1.setUserName("������");			//ͨ��setUserName()������user_1�����е�username���Ը�ֵΪ������
		user_1.setPassWord("ergouzi");			//ͨ��setPassWord()������user_1�����е�password���Ը�ֵΪergouzi
		user_1.setAge(16);						//ͨ��setAge()������user_1�����е�age���Ը�ֵΪ16
		String user_1_str= user_1.toString();	//ͨ��toString()������ȡuser_1�����е�����������Ϣ
		System.out.println(user_1_str);			//��ӡuser_1�����е�����������Ϣ
		System.out.println(user_1.id);			//ֱ�ӷ���user_1�����еĹ�������
		//System.out.println(user_1.username);	//ֱ�ӷ���user_1�����е�˽�����ԣ��﷨������Ϊ������ⲿ���޷�ͨ��ʵ�����Ķ���������˽�г�Ա����
		//ͨ��get������ȡuser_1�����е�������Ϣ
		System.out.println(user_1.getId() + "," 
						 + user_1.getUserName() + "," 
						 + user_1.getPassWord() + "," 
						 + user_1.getAge());
		boolean flag;
		flag = user_1.verification("������", "ergouzi");		//ͨ��verification()������֤�û���������
		verification(flag);								 	//ͨ��verification()�����鿴��֤���
		flag = user_1.verification("������", "er");		 	//ͨ��verification()������֤�û���������4
		verification(flag);								 	//ͨ��verification()�����鿴��֤���

		User user_2 = new User(0, "����", "dagouzi", 18);//ͨ��һ���вι��캯��ʵ������һ����Ϊuser_2��User��Ķ���
														  //���ҳ�ʼ������ ���� 
														  //id = 0 
														  //username = �����ӡ� 
														  //password = ��dagouzi�� 
														  //age = 18
		String user_2_str= user_2.toString();	//ͨ��toString()������ȡuser_2�����е�����������Ϣ
		System.out.println(user_2_str);			//��ӡuser_2�����е�����������Ϣ
		
		
	}
	private static void verification(boolean flag) {
		if(flag) {
			System.out.println(flag + "��֤�ɹ�");
		}else {
			System.out.println(flag + "��֤ʧ��");
		}
	}

}
/**
 * 
* @ClassName: User
* @Description: ���û���ĳ��󡢷�װ���������η���ʹ��
*
* @version: v1.0.0
* @author: ��ĳĳ
* @date: 2018��11��7�� ����9:45:28
 */
class User {
	/**
	 * �û����
	 */
	public int id;//����һ��Сд
	/**
	 * �û���
	 */
	private String username;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * �û�����
	 */
	private int age;
	/**
	 * 
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: �޲ι��캯��
	*
	* @param:�޲���
	* @version: v1.0.0
	* @author: ��ĳĳ
	* @date: 2018��11��7�� ����9:56:37
	 */
	public User() {
		
	}
	/**
	 * 
	* @Function: LearnJava_1_chouxiangfengzhuang.java
	* @Description: �вι�������ʵ����ʱ��ʼ�������ڵ�����
	*
	* @param:id       -> �û����
			 username -> �û���
			 password -> �û�����
			 age      -> �û�����
	* @version: v1.0.0
	* @author: ��ĳĳ
	* @date: 2018��11��7�� ����10:05:07
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
	* @Description: ��֤�û��û���������
	*
	* @param:username -> �û���
			 password -> �û�����
	* @return���û�����������������б����û���������һ�·���True���򷵻�False
	* @throws���쳣����
	*
	* @version: v1.0.0
	* @author: ��ĳĳ
	* @date: 2018��11��7�� ����10:07:35
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
	* @Description: ��дtoString()����
	*
	* @param:�޲���
	* @return�������û���Ϣ
	* @throws���쳣����
	*
	* @version: v1.0.0
	* @author: ��ĳĳ
	* @date: 2018��11��7�� ����9:51:45 
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
