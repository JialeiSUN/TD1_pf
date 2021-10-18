package td1_pf.arbres;

public class Entier implements Sommable<Entier> {
    private int in;
    private int racine;
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
}
