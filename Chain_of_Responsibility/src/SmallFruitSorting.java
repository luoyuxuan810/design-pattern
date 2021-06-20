public class SmallFruitSorting extends AbstractFruitSort{
    public SmallFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("´ò¹ûÖ­:"+fruit);
    }
}
