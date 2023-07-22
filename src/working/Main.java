package working;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
             intList.stream();
        Stream<Integer> stream_1 = intList.stream();
        Stream<Integer> stream_2 = stream_1.filter(x -> x > 0);
        Stream<Integer> stream_3 = stream_2.filter(x -> x % 2 == 0);
        Stream<Integer> stream_4 = stream_3.sorted(Comparator.naturalOrder());

        stream_4.forEach(System.out::println);
    }
}
