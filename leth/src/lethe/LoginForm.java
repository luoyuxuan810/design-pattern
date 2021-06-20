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
        System.out.print("������");
        if (sc.hasNext()) {
            userName = sc.next();
        }
        System.out.print("���룺");
        if (sc.hasNext()) {
            userPassword = sc.next();
        }
        sc.close();
        this.validate();
    }

    public void validate() {
        try {
            if (dao.findUser(userName, userPassword)) {
                System.out.println("��¼�ɹ�����ӭʹ�á�");
            } else {
                System.out.println("��¼ʧ�ܣ�����ϸ����û��������룡");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}