package td1_pf.arbres;

public class Chaine implements Sommable<Chaine> {
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
}
