package com.github.gomi.fpj;

public interface F3<A, B, C, D> {

    D apply(final A a, final B b, final C c);

    default F2<B, C, D> f(final A a) {
        return (b, c) -> apply(a, b, c);
    }

    default F1<C, D> f(final A a, final B b) {
        return c -> apply(a, b, c);
    }

    default F1<A, F1<B, F1<C, D>>> curry() {
        return a -> b -> c -> apply(a, b, c);
    }

}
