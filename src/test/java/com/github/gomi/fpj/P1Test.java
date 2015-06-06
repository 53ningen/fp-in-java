package com.github.gomi.fpj;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.Test;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

import static com.github.gomi.fpj.P.$;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class P1Test {

    @Test
    public void testEq() {
        assertThat($(1), is($(1)));
        assertThat($("abc"), is($("abc")));
    }

    @Test
    public void testToString() {
        assertThat($(1).toString(), is("(1)"));
        assertThat($("abc").toString(), is("(abc)"));
    }

    @Test
    public void test_1() {
        assertThat($(1)._1(), is(1));
        assertThat($("abc")._1(), is("abc"));
    }

    @Theory
    public void _1(@ForAll Object o1, @ForAll Object o2) {
        assertEquals($(o1)._1(), o1);
    }

    @Theory
    public void snd(@ForAll Object o1, @ForAll Object o2) {
        assertEquals($(o1, o2)._2(), o2);
    }

}
