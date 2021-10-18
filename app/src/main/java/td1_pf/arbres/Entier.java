package td1_pf.arbres;

public class Entier implements Sommable<Entier>, Comparable<Entier> {
    private int in;
    public Entier(int a){
        this.in = a;
    }
    public int getEntier(){
        return this.in;
    }
    @Override
    public Entier sommer(Entier other) {
        this.in += other.getEntier();
        return this;
    }

    @Override
    public Entier compareTo(Entier next) {
        if(in<next.getEntier()){
            return this;
        }
        else{
            return  next;
        }
    }
}
