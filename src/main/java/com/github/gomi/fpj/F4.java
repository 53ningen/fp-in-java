package com.github.gomi.fpj;

public interface F4<A, B, C, D, E> {

    E apply(final A a, final B b, final C c, final D d);

    default F3<B, C, D, E> f(final A a) {
        return (b, c, d) -> apply(a, b, c, d);
    }

    default F2<C, D, E> f(final A a, final B b) {
        return (c, d) -> apply(a, b, c, d);
    }

    default F1<D, E> f(final A a, final B b, final C c) {
        return d -> apply(a, b, c, d);
    }

    default F1<A, F1<B, F1<C, F1<D, E>>>> curry() {
        return a -> b -> c -> d -> apply(a, b, c, d);
    }

}
