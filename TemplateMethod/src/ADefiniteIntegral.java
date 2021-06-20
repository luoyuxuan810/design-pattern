public abstract class ADefiniteIntegral {
    protected abstract double geta();
    protected abstract double getb();
    protected abstract int getc();
    protected abstract double fuction(double x);
    public final double CalDefiniteIntegral(){
        double a= 0,b = 0,t = 0,sum = 0;
        int c = 0;
        a = geta();
        b = getb();
        c = getc();
        if (a>b){
            t = a;
            a = b;
            b = t;
        }
        t = (b-a)/(double)c;
        for (int i = 0; i < c; i++) {
            sum = sum+t*fuction(a+i*t);
        }
        return sum;
    }
}
