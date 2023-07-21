package calculator;

import java.util.function.*;

public class Calculator  {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Вы пытаетесь поделить на ноль,а этого делать нельзя!");
        }
        return 0;
    };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Predicate<Integer> isPositive = x -> x > 0;
        //Predicate<Integer> getIsPositive = y -> y > 5;
        Consumer<Integer> println = System.out::println;

    }





