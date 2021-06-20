package lethe;


import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		System.out.println("欢迎登录！");
		System.out.println("请输入您的用户名和密码");
        LoginForm login = new LoginForm();
        login.init();
	/*Scanner sc=new Scanner(System.in);
	for(int i=3;i>0;i--) {
		System.out.println("请输入您的用户名和密码：");
		String name=sc.next();
		String password=sc.next();
		if("admin".equals(name)&&"123".equals(password)) {
			System.out.println("登录成功");
			break;
		}
		if(i==1)
			System.out.println("错误次数过多请联系客服");
		else
			System.out.println("用户名或密码错误，您还有"+(i-1)+"次机会 ");
	    }*/
	}
}