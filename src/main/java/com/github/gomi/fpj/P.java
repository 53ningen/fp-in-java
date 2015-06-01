package com.github.gomi.fpj;

public final class P {

    private P() {
    }

    public static Unit $() {
        return Unit.unit;
    }

    public static <A> P1<A> $(final A a) {
        return new P1<A>() {
            @Override
            public A _1() {
                return a;
            }
        };
    }

    public static <A, B> P2<A, B> $(final A a, final B b) {
        return new P2<A, B>() {
            @Override
            public A _1() {
                return a;
            }

            @Override
            public B _2() {
                return b;
            }
        };
    }

}
