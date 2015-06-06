package com.github.gomi.fpj;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static com.github.gomi.fpj.Monoid.*;
import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class MonoidTest {

    @Theory
    public void intAssociativity(@ForAll Integer i1, @ForAll Integer i2, @ForAll Integer i3) {
        assertEquals(intAddition.op(i1, intAddition.op(i2, i3)), intAddition.op(intAddition.op(i1, i2), i3));
        assertEquals(intMultiplication.op(i1, intMultiplication.op(i2, i3)), intMultiplication.op(intMultiplication.op(i1, i2), i3));
    }

    @Theory
    public void intIdentity(@ForAll Integer i1) {
        assertEquals(intAddition.op(i1, intAddition.zero()), intAddition.op(intAddition.zero(), i1));
        assertEquals(intMultiplication.op(i1, intMultiplication.zero()), intMultiplication.op(intMultiplication.zero(), i1));
    }

    @Theory
    public void booleanAssociativity(@ForAll Boolean b1, @ForAll Boolean b2, @ForAll Boolean b3) {
        assertEquals(booleanOr.op(b1, booleanOr.op(b2, b3)), booleanOr.op(booleanOr.op(b1, b2), b3));
        assertEquals(booleanAnd.op(b1, booleanAnd.op(b2, b3)), booleanAnd.op(booleanAnd.op(b1, b2), b3));
    }

    @Theory
    public void booleanIdentity(@ForAll Boolean b1) {
        assertEquals(booleanOr.op(b1, booleanOr.zero()), booleanOr.op(booleanOr.zero(), b1));
        assertEquals(booleanAnd.op(b1, booleanAnd.zero()), booleanAnd.op(booleanAnd.zero(), b1));
    }

}
