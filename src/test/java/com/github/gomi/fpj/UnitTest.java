package com.github.gomi.fpj;

import org.junit.Test;

import static com.github.gomi.fpj.P.$;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnitTest {

    @Test
    public void testEq() {
        assertThat($(), is($()));
    }

    @Test
    public void testToString() {
        assertThat($().toString(), is("()"));
    }

}
