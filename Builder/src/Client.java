public class Client {
    public static void main(String[] args) throws Exception {
        MealBuilder mb = (MealBuilder) ProUtil.getBean();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal = waiter.construct();
        System.out.println("�ײ���ɣ�");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}