package td1_pf.arbres;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre{
    private List<Arbre> listfeuille;
    public Noeud(List<Arbre> val){
        listfeuille = val;
    }


    @Override
    public int taille() {
        int rtr =0;
        for(final Arbre a:listfeuille){
            rtr += a.taille();
        }
        return rtr;
    }
    @Override
    public boolean contient(Integer val) {
        boolean rtr = false;
        for(final Arbre a : listfeuille){
            if(a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> rtr = null;
        for(final Arbre a: listfeuille){
            rtr.add(a.min());
        }
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
