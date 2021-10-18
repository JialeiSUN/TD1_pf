package td1_pf.arbres;

import java.util.Set;

public class Feuille<T extends Sommable<T> & Comparable<T>> implements Arbre<T>{
    private T feuille;
    public Feuille(final T value){
        this.feuille = value;
    }
    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        return val.equals(feuille);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(feuille);
    }

    @Override
    public T somme() {
        return feuille;
    }
/*
    @Override
    public T min() {
        return feuille;
    }

    @Override
    public T max() {
        return feuille;
    }

    @Override
    public boolean estTrie() {
        return true;
    }*/
}
