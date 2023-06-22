import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[] args) {
        /*
         * reduce(T identity, BinaryOperator<T> accumulator): Tính toán kết quả của các phần tử trong stream bằng cách
         * sử dụng một phép tính nhị phân được chỉ định bởi accumulator, với giá trị ban đầu được cung cấp bởi identity.
         * */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Tính tổng của các số nguyên trong Stream
        System.out.println(sum); // Kết quả: 15
        /*
         * collect(Collector<T, A, R> collector): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng
         *  một đối tượng Collector.
         * */
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedNames); // Kết quả: "John, Jane, Alice, Bob"

    }
}
