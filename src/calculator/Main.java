package calculator;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Calculator calc = Calculator.instance.get();
          try { int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);// нельзя делить на ноль,calc.minus.apply(1,1)=итог этого решения будет "0".
            calc.println.accept(c);

    } catch (ArithmeticException e){
              System.out.println("Итогом вычисления в  методе devide стал зеро,а на ноль делить нельзя в методе devide");}
    }

}
