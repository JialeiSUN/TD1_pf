package td1_pf.arbres;

import java.util.Set;

public class Feuille implements Arbre{
    private int feuille;
    public Feuille(final int value){
        this.feuille = value;
    }
    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final Integer val) {
        return val.equals(feuille);
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(feuille);
    }

    @Override
    public Integer somme() {
        return feuille;
    }

    @Override
    public Integer min() {
        return feuille;
    }

    @Override
    public Integer max() {
        return feuille;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
