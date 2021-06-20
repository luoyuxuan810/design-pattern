public class Client {
    public static void main(String[] args) {
//        ShallowCopy();
        Manager();
    }
    public static void ShallowCopy(){
        MyFruit fruit1 = new Apple();
//        MyFruit fruit2 = fruit1;
        MyFruit fruit2 = (Apple)fruit1.clone();
        fruit1.Display();
        fruit2.Display();
        System.out.println("fruit1"+fruit1.hashCode());
        System.out.println("fruit2"+fruit2.hashCode());
        System.out.println("fruit1"+fruit1.toString());
        System.out.println("fruit2"+fruit2.toString());
        System.out.println(fruit1.equals(fruit2));
    }

    public static void Manager(){
        MyFruit fruit1 = new Apple();
        MyFruit fruit2 = new Banana();
        MyFruitStore.Add(1,fruit1);
        MyFruitStore.Add(2,fruit2);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        MyFruit fruit = MyFruitStore.Get(2);
        fruit.Display();
    }
}
