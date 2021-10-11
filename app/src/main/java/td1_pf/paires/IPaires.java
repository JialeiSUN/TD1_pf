package td1_pf.paires;

public interface IPaires<A,B> {
    A fst();
    B snd();
    <C> IPaires<C,B> changeFst(C value);
    <C> IPaires<A,C> changeSnd(C value);
}
