package com.learn.java.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        //prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm here runnable1");
            }
        };
        new Thread(runnable).start();

        // Java 8 Lambda
        // () -> {}

        Runnable runnableLambda1 = () -> {
            System.out.println("I'm here runnableLambda1");
        };
        new Thread(runnableLambda1).start();

        Runnable runnableLambda2 = () -> System.out.println("I'm here runnableLambda2");
        new Thread(runnableLambda2).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm here runnableLambda2.1");
            }
        }).start();
        new Thread(() -> System.out.println("I'm here runnableLambda3")).start();
    }
}
