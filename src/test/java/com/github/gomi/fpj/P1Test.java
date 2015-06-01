package com.github.gomi.fpj;

import org.junit.Test;

import static com.github.gomi.fpj.P.$;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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

}
