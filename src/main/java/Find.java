import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find {
    public static void main(String[] args) {
        //findFirst(): Trả về phần tử đầu tiên trong stream.
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        Optional<Integer> firstNumber = numbers.stream()
                .findFirst(); // Lấy phần tử đầu tiên trong Stream
        if (firstNumber.isPresent()) {
            System.out.println(firstNumber.get()); // Kết quả: 1
        } else {
            System.out.println("Stream is empty"); // Kết quả: Stream is empty
        }
//        findAny(): Trả về bất kỳ phần tử nào trong stream.
        Optional<Integer> anyNumber = numbers.stream()
                .filter(n -> n > 5) // Lọc các số lớn hơn 5
                .findAny(); // Lấy bất kỳ một số nào đó trong Stream sau khi lọc
        if (anyNumber.isPresent()) {
            System.out.println(anyNumber.get()); // Kết quả: 7 (hoặc một số khác lớn hơn 5 trong Stream)
        } else {
            System.out.println("Stream is empty"); // Kết quả: Stream is empty
        }

    }
}
