package calculator;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args)  {
        Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);// нельзя делить на ноль,calc.minus.apply(1,1)=итог этого решения будет "0".
            calc.println.accept(c);

    }

}
