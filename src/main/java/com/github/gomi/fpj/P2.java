package com.github.gomi.fpj;

public abstract class P2<A, B> {

    public abstract A _1();

    public abstract B _2();

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final P2<A, B> p2 = (P2<A, B>) o;
        return _1().equals(p2._1())
                && _2().equals(p2._2());
    }

    @Override
    public int hashCode() {
        return _1().hashCode() * 31
                + _2().hashCode();
    }

    @Override
    public String toString() {
        return "(" + _1() + "," + _2() + ")";
    }

}
