public class Client {
    public static void main(String[] args) throws Exception {
        Color color;
        Pen pen;

        color = (Color) ProUtil.getBean("Color");
        pen = (Pen) ProUtil.getBean("Pen");

        pen.setColor(color);
        pen.draw("œ ª®");
    }
}
