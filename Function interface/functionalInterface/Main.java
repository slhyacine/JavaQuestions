package functionalInterface;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;

        // Demo of the "apply" function of the Function interface
        System.out.println(half.apply(10));

        // demo of "andThen" method of the Function interface
        // It execute half function then add 8 function
        half = half.andThen(a -> a + 8);
        System.out.println(half.apply(10));

        // demo of the "compose" function fo the Function interface
        // It executes the minus 4 function then the half function
        half = half.compose(a -> a - 4);
        System.out.println(half.apply(10));

        // demo of the "identity" function of the Function interface
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(10));

    }

}
