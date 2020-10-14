package com.learn.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    private Predicate<Integer> checkEven = (i) -> { return i%2==0;};

    private Predicate<Integer> checkOdd = (i) -> i%2==1;

    private Predicate<Integer> divisibleByFive = (i) -> i%5==0;

    public static void main(String[] args) {
        PredicateExample instance = new PredicateExample();
        System.out.println(instance.checkEven.test(10));
        System.out.println(instance.checkOdd.test(9));
        instance.predicateAnd();
        instance.predicateOr();
        instance.predicateNegate();
    }

    public void predicateAnd() {
        System.out.println("PredicateAnd result is: " + checkEven.and(divisibleByFive).test(10));
        System.out.println("PredicateAnd result is: " + checkEven.and(divisibleByFive).test(9));
    }

    public void predicateOr() {
        System.out.println("PredicateOr result is: " + checkEven.or(divisibleByFive).test(10));
        System.out.println("PredicateOr result is: " + checkEven.or(divisibleByFive).test(9));
    }

    public void predicateNegate() {
        System.out.println("PredicateNegate result is: " + checkEven.or(divisibleByFive).negate().test(10));
        System.out.println("PredicateNegate result is: " + checkEven.or(divisibleByFive).negate().test(8));
        System.out.println("PredicateNegate result is: " + checkEven.or(divisibleByFive).negate().test(11));
    }
}
