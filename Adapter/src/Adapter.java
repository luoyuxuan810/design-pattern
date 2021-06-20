/**
 * 类模式
 */

//public class Adapter extends OldJuicer implements InewJuicer {
//    public String newPort(String fruit1, String fruit2) {
//        String str = "混合果汁："+onePort(fruit1)+onePort(fruit2);
//        return str;
//    }
//
//}

/**
 * 对象模式
 */

public class Adapter implements InewJuicer {
    public String newPort(String fruit1, String fruit2) {
        OldJuicer oldJuicer = new OldJuicer();
        String str = "混合果汁："+oldJuicer.onePort(fruit1)+oldJuicer.onePort(fruit2);
        return str;
    }

}