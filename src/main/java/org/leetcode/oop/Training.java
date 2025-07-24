package org.leetcode.oop;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Training {

    static {
        System.out.println( "Hello World" );
        Set<E1> set = EnumSet.of(E1.JACK, E1.QUEEN, E1.KING);
        System.out.println(set.stream()
                .map(x -> x + " 1")
                .filter(x -> x.startsWith("J"))
                .collect(Collectors.toList()));

    }
    public static void main(String[] args) {

        Set<E1> set = EnumSet.of(E1.JACK, E1.QUEEN, E1.KING);
        System.out.println(set.stream()
                .map(x -> x + " 1")
                .filter(x -> x.startsWith("J"))
                .collect(Collectors.toList()));

        System.out.println(BigInteger.valueOf(Integer.MAX_VALUE));
        double a = 0.1;
        double b = 0.2;
        double sum = a+b;
        System.out.println(sum == 0.3);

        // Default folder is \u0031 users\default
        System.out.println("\u1666");
        System.out.println("\u005B\u005D");
        double Π = 3.14159;
        System.out.println(Π);

        long x = 1_000_000_000;
        System.out.println(x);

        int y = 1_000;
        System.out.println(y);

        System.out.printf( "%1$tB %1$te, %1$tY", new Date() );
        int[][] triangle = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println();
        System.out.println(Arrays.deepToString(triangle));

        var v = new Object();
        System.out.println(v.getClass());

        //Multithreading
        System.out.println( Thread.currentThread().getName() );
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println(Thread.currentThread().getName())));
//        Main obj = new Main();
//        Cleaner cleaner = Cleaner.create();
//        cleaner.register( obj, () -> System.out.println( Thread.currentThread().getName() ) );
//        obj = null;
//        System.gc();
    }
}
enum E1{
    JACK, QUEEN, KING
}