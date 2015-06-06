package com.github.gomi.fpj;

public interface Monoid<A> {

    A op(A a1, A a2);

    A zero();

    static Monoid<Integer> intAddition = new Monoid<Integer>() {
        @Override
        public Integer op(Integer a1, Integer a2) {
            return a1 + a2;
        }

        @Override
        public Integer zero() {
            return 0;
        }
    };

    static Monoid<Integer> intMultiplication = new Monoid<Integer>() {
        @Override
        public Integer op(Integer a1, Integer a2) {
            return a1 * a2;
        }

        @Override
        public Integer zero() {
            return 1;
        }
    };

    static Monoid<Boolean> booleanOr = new Monoid<Boolean>() {
        @Override
        public Boolean op(Boolean a1, Boolean a2) {
            return a1 || a2;
        }

        @Override
        public Boolean zero() {
            return false;
        }
    };

    static Monoid<Boolean> booleanAnd = new Monoid<Boolean>() {
        @Override
        public Boolean op(Boolean a1, Boolean a2) {
            return a1 && a2;
        }

        @Override
        public Boolean zero() {
            return true;
        }
    };

}
