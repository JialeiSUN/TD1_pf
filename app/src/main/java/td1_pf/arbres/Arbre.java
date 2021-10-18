package td1_pf.arbres;

import java.util.Set;

public interface Arbre<T extends Sommable<T>> {
    int taille(); // nombre de valeurs
    boolean contient(final T val); // vrai si val est contenue dans l'arbre,
    Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre
    T somme();
  /*  T somme(); // somme des valeurs
    T min(); // valeur minimale
    T max(); // valeur maximale
    boolean estTrie(); // vrai si l'arbre est trié, faux sinon*/

}
