package com.github.gomi.fpj;

public interface F2<A, B, C> {

    C apply(final A a, final B b);

    default F1<B, C> f(final A a) {
        return b -> apply(a, b);
    }

    default F1<A, F1<B, C>> curry() {
        return a -> b -> apply(a, b);
    }

}
