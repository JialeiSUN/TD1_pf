package td1_pf.arbres;

import static org.checkerframework.checker.units.UnitsTools.min;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {
    private String chaine;
    public Chaine(String a){
        this.chaine =a;
    }
    public String getChaine(){
        return chaine;
    }
    @Override
    public Chaine sommer(Chaine other) {
        this.chaine += other.getChaine();
        return this;
    }

    @Override
    public Chaine compareTo(Chaine next) {

        return null;
    }
}
