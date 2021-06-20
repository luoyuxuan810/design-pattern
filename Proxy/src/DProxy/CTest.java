package DProxy;

public class CTest implements ITestInterface{
    @Override
    public void SendMessage(String mes) {
        for (int i = 0; i < 5; i++) {
            System.out.println(mes+"怪物的出现还有"+(i+1)+"秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(mes+"怪物出来了！");
    }
}
