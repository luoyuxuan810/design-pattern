/**
 * ��ģʽ
 */

//public class Adapter extends OldJuicer implements InewJuicer {
//    public String newPort(String fruit1, String fruit2) {
//        String str = "��Ϲ�֭��"+onePort(fruit1)+onePort(fruit2);
//        return str;
//    }
//
//}

/**
 * ����ģʽ
 */

public class Adapter implements InewJuicer {
    public String newPort(String fruit1, String fruit2) {
        OldJuicer oldJuicer = new OldJuicer();
        String str = "��Ϲ�֭��"+oldJuicer.onePort(fruit1)+oldJuicer.onePort(fruit2);
        return str;
    }

}