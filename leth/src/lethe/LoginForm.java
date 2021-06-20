package lethe;
import java.util.Scanner;

public class LoginForm {
    private UserDAO dao = new UserDAO();
    private String userName = "";
    private String userPassword = "";
    public void init() {
        this.display();
    }
    public void display() {
        Scanner sc = new Scanner(System.in);
        //Scanner password=new Scanner(System.in);
        System.out.print("姓名：");
        if (sc.hasNext()) {
            userName = sc.next();
        }
        System.out.print("密码：");
        if (sc.hasNext()) {
            userPassword = sc.next();
        }
        sc.close();
        this.validate();
    }

    public void validate() {
        try {
            if (dao.findUser(userName, userPassword)) {
                System.out.println("登录成功，欢迎使用。");
            } else {
                System.out.println("登录失败，请仔细检查用户名和密码！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}