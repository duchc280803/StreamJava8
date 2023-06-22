import java.util.Arrays;
import java.util.List;

public class Matching {
    public static void main(String[] args) {
        /*
         * anyMatch(Predicate<T> predicate): Kiểm tra xem có phần tử nào trong stream thỏa mãn
         * điều kiện được đưa ra bởi predicate hay không.
         * */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean hasEvenNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0); // Kiểm tra xem có số chẵn nào trong Stream hay không
        System.out.println(hasEvenNumber); // Kết quả: true
        /*
        * allMatch(Predicate<T> predicate): Kiểm tra xem tất cả các phần tử trong stream đều
        *  thỏa mãn điều kiện được đưa ra bởi predicate hay không.
        * */
        boolean allEvenNumbers = numbers.stream()
                .allMatch(n -> n % 2 == 0); // Kiểm tra xem tất cả các số trong Stream đều là số chẵn hay không
        System.out.println(allEvenNumbers); // Kết quả: false
        /*
        * noneMatch(Predicate<T> predicate): Kiểm tra xem không có phần tử nào trong stream
        * thỏa mãn điều kiện được đưa ra bởi predicate hay không.
        * */
        boolean noneEvenNumbers = numbers.stream()
                .noneMatch(n -> n % 2 == 0); // Kiểm tra xem không có số chẵn nào trong Stream
        System.out.println(noneEvenNumbers); // Kết quả: true

    }
}
