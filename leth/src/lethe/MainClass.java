package lethe;


import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		System.out.println("��ӭ��¼��");
		System.out.println("�����������û���������");
        LoginForm login = new LoginForm();
        login.init();
	/*Scanner sc=new Scanner(System.in);
	for(int i=3;i>0;i--) {
		System.out.println("�����������û��������룺");
		String name=sc.next();
		String password=sc.next();
		if("admin".equals(name)&&"123".equals(password)) {
			System.out.println("��¼�ɹ�");
			break;
		}
		if(i==1)
			System.out.println("���������������ϵ�ͷ�");
		else
			System.out.println("�û������������������"+(i-1)+"�λ��� ");
	    }*/
	}
}