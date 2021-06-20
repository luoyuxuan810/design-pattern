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
        MyFruitStore mfs1 = MyFruitStore.GetFruitStore();
        mfs1.Add(1,fruit1);
        mfs1.Add(2,fruit2);
        mfs1.Add(3,new Apple());
        mfs1.Add(4,new Banana());
        MyFruitStore mfs2 = MyFruitStore.GetFruitStore();

        MyFruit fruit = mfs1.Get(2);
        fruit.Display();
        System.out.println("mfs1:"+mfs1.toString());
        System.out.println("mfs2:"+mfs2.toString());
    }
}
