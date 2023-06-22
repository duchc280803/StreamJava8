import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max {
    /*
    * max(Comparator<T> comparator): Trả về phần tử lớn nhất theo thứ tự được chỉ định bởi comparator.
    * */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 4);
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        if (maxNumber.isPresent()) {
            System.out.println(maxNumber.get()); // Kết quả: 5
        } else {
            System.out.println("Stream is empty"); // Kết quả: Stream is empty
        }

    }
}
