public class Chef {
    private ICutFruit cutmethod;

    public void setCutmethod(ICutFruit cutmethod) {
        this.cutmethod = cutmethod;
    }

    public void CutFruit(String fruitname){
        cutmethod.CutStrategy(fruitname);
    }
}
