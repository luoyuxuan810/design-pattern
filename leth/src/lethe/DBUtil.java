package lethe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
   public Connection getConnection() {
	   Connection con; //����connection����
	   //����������
	   String driver="com.mysql.jdbc.Driver";
	   //URLָ��Ҫ���ʵ����ݿ���mydata
	   String url="jdbc:mysql://localhost:3306/library";
	   String user="root"; //�û���root
	   String password=""; //MySQL����ʱ������
	   //������ѯ�����
	   try {
		   //������������
		   Class.forName(driver);
		   //getConnection()����������MySQL���ݿ�
		   con=DriverManager.getConnection(url,user,password);
		 
	   }catch(ClassNotFoundException e) {
		   //���ݿ��������쳣
		   System.out.println("sorry,can't find the driver");
		   e.printStackTrace();
	   }catch(SQLException e) {
		   //���ݿ�����ʧ���쳣����
		   e.printStackTrace();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	return null;
			
   }
}


