package com.github.gomi.fpj;

import com.pholser.junit.quickcheck.ForAll;
import org.junit.Test;
import org.junit.contrib.theories.Theory;

import static com.github.gomi.fpj.P.$;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class P2Test {

    @Test
    public void testEq() {
        assertThat($(1, 2), is($(1, 2)));
        assertThat($("abc", "def"), is($("abc", "def")));
        assertThat($(1, "def"), is($(1, "def")));
        assertThat($("abc", 2), is($("abc", 2)));
    }

    @Test
    public void testToString() {
        assertThat($(1, 2).toString(), is("(1,2)"));
        assertThat($("abc", "def").toString(), is("(abc,def)"));
        assertThat($(1, "def").toString(), is("(1,def)"));
        assertThat($("abc", 2).toString(), is("(abc,2)"));
    }

    @Test
    public void test_1() {
        assertThat($(1, 2)._1(), is(1));
        assertThat($("abc", "def")._1(), is("abc"));
        assertThat($(1, "def")._1(), is(1));
        assertThat($("abc", 2)._1(), is("abc"));
    }

    @Test
    public void test_2() {
        assertThat($(1, 2)._2(), is(2));
        assertThat($("abc", "def")._2(), is("def"));
        assertThat($(1, "def")._2(), is("def"));
        assertThat($("abc", 2)._2(), is(2));
    }

    @Theory
    public void _1(@ForAll Object o1, @ForAll Object o2) {
        assertEquals($(o1, o2)._1(), o1);
    }

    @Theory
    public void _2(@ForAll Object o1, @ForAll Object o2) {
        assertEquals($(o1, o2)._2(), o2);
    }

}
