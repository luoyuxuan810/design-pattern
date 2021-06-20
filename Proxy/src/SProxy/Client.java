package SProxy;

public class Client {
    public static void main(String[] args) {
//       SProxy.CLocalPicShow cls = new SProxy.CLocalPicShow();
       IShowPic cls = new CLocalPicShow();
        cls.ShowPic("photo");
    }
}
