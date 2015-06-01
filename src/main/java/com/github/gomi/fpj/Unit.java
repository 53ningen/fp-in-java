package com.github.gomi.fpj;

/**
 * There is only one value of type `Unit`, `()`, and
 * it is not represented by any object in the underlying runtime system.
 */
public enum Unit {

    unit;

    @Override
    public String toString() {
        return "()";
    }

    static Unit $() {
        return unit;
    }

}
