package com.github.gomi.fpj;

public abstract class P1<A> {

    public abstract A _1();

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final P1<A> p1 = (P1<A>) o;
        return _1().equals(p1._1());
    }

    @Override
    public int hashCode() {
        return _1().hashCode();
    }

    @Override
    public String toString() {
        return "(" + _1() + ")";
    }

}
