public class MidFruitSorting extends AbstractFruitSort{
    public MidFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("Ë®¹û¹ÞÍ·:"+fruit);
    }
}
