package lethe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
   public Connection getConnection() {
	   Connection con; //声明connection对象
	   //驱动程序名
	   String driver="com.mysql.jdbc.Driver";
	   //URL指向要访问的数据库名mydata
	   String url="jdbc:mysql://localhost:3306/library";
	   String user="root"; //用户名root
	   String password=""; //MySQL配置时的密码
	   //遍历查询结果集
	   try {
		   //加载驱动程序
		   Class.forName(driver);
		   //getConnection()方法，连接MySQL数据库
		   con=DriverManager.getConnection(url,user,password);
		 
	   }catch(ClassNotFoundException e) {
		   //数据库驱动类异常
		   System.out.println("sorry,can't find the driver");
		   e.printStackTrace();
	   }catch(SQLException e) {
		   //数据库连接失败异常处理
		   e.printStackTrace();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	return null;
			
   }
}


