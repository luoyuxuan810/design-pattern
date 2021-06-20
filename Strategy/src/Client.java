public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();
        ICutFruit cut = new MultiBlade();
        chef.setCutmethod(cut);
        chef.CutFruit("Ёхвс");
    }
}
