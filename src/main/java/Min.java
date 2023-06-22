import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
    /*
     * min(Comparator<T> comparator): Trả về phần tử nhỏ nhất theo thứ tự được chỉ định bởi comparator.
     * */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        if (minNumber.isPresent()) {
            System.out.println(minNumber.get()); // Kết quả: 1
        } else {
            System.out.println("Stream is empty"); // Kết quả: Stream is empty
        }

    }
}
