import java.util.ArrayList;
import java.util.List;

public class SellHolder implements IStockHolder{
    private List<AStockPrice> attentionlist;
    private String name;

    public SellHolder(String name) {
        this.name = name;
        attentionlist = new ArrayList<AStockPrice>();
    }

    @Override
    public void update(AStockPrice asp) {
        if (attentionlist.contains(asp)){
            System.out.println(name);
            if (asp.getPrice()-asp.getPrice2()>0){
                System.out.print(asp.code+":");
                System.out.println("原价:"+asp.price2+"-现价:"+asp.price);
                System.out.println("涨了，哭");
            }
            else
                System.out.print(asp.code+":");
            System.out.println("原价:"+asp.price2+"-现价:"+asp.price);
            System.out.println("跌了，爽");
        }
    }

    @Override
    public void AddHolder(AStockPrice asp) {
        attentionlist.add(asp);
        asp.Add(this);
    }
}
