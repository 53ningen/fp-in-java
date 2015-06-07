package com.github.gomi.fpj;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static com.github.gomi.fpj.Monoid.*;
import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class MonoidTest {

    <A> void associativity(final Monoid<A> m, final A a1, final A a2, final A a3) {
        assertEquals(m.op(a1, m.op(a2, a3)), m.op(m.op(a1, a2), a3));
    }

    <A> void identity(final Monoid<A> m, final A a) {
        assertEquals(m.op(a, m.zero()), m.op(m.zero(), a));
    }

    @Theory
    public void intAssociativity(@ForAll Integer i1, @ForAll Integer i2, @ForAll Integer i3) {
        associativity(intAddition, i1, i2, i3);
        associativity(intMultiplication, i1, i2, i3);
    }

    @Theory
    public void intIdentity(@ForAll Integer i1) {
        identity(intAddition, i1);
        identity(intMultiplication, i1);
    }

    @Theory
    public void booleanAssociativity(@ForAll Boolean b1, @ForAll Boolean b2, @ForAll Boolean b3) {
        associativity(booleanOr, b1, b2, b3);
        associativity(booleanAnd, b1, b2, b3);
    }

    @Theory
    public void booleanIdentity(@ForAll Boolean b1) {
        identity(booleanOr, b1);
        identity(booleanAnd, b1);
    }

}
