public class Operator {
    public void MarkFruit(Order order) {
        String str = "";
        for (String key:order.getFruitmap().keySet()){
            str+=key+order.getFruitmap().get(key);
        }
        System.out.println("Ë®¹ûÆ´ÅÌ£º"+str);
    }
}
