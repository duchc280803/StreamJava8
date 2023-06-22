import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
//        sorted(): Sắp xếp các phần tử theo thứ tự tăng dần.
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);
        List<Integer> sortedNumber = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumber);
//---------------------------------------------------------------------------------------------------------------
        //        sorted(Comparator<T> comparator): Sắp xếp các phần tử theo thứ tự được chỉ định bởi comparator.
        List<Person> listObject = Arrays.asList(
                new Person("Đức", 19),
                new Person("Hùng", 19),
                new Person("Minh", 19),
                new Person("Phong", 27),
                new Person("Nguyên", 23)
        );
        List<Person> listPerson = listObject.stream().
                sorted(Comparator.comparing(Person::getAge)).
                collect(Collectors.toList());
        System.out.println(listPerson.toString());
//---------------------------------------------------------------------------------------------------------------
        //    peek(Consumer<T> action): Thực hiện một hành động trên mỗi phần tử và trả về stream đầu vào.
        List<Integer> numbersPeek = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbersPeek.stream()
                .filter(n -> n % 2 == 0) // Lọc các số chẵn
                .peek(System.out::println) // In ra các số đã được lọc
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Kết quả: [2, 4]
//---------------------------------------------------------------------------------------------------------------
        //    limit(long maxSize): Giới hạn số phần tử được trả về trong stream.
        List<Integer> numbersLimit = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> limitedNumbers = numbersLimit.stream()
                .limit(3) // Giới hạn số lượng phần tử là 3
                .collect(Collectors.toList());
        System.out.println(limitedNumbers); // Kết quả: [1, 2, 3]
// ---------------------------------------------------------------------------------------------------------------
        //    skip(long n): trả về 1 stream nhưng bỏ qua n phần tử đầu tiên từ stream ban đầu.
        List<Integer> numbersKip = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = numbersKip.stream()
                .skip(2) // Bỏ qua 2 phần tử đầu tiên
                .collect(Collectors.toList());
        System.out.println(skippedNumbers); // Kết quả: [3, 4, 5]

// ---------------------------------------------------------------------------------------------------------------
        //    forEach(Consumer<T> action): Thực hiện một hành động trên mỗi phần tử.
        List<Integer> numberForEach = Arrays.asList(1, 2, 3, 4, 5);
        numberForEach.stream()
                .forEach(System.out::println); // In ra từng số trên một dòng
// ---------------------------------------------------------------------------------------------------------------
        //    toArray(): Chuyển stream thành một mảng.
        List<Integer> numberToArray = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] array = numberToArray.stream()
                .toArray(Integer[]::new); // Chuyển đổi Stream thành một mảng Integer
        System.out.println(Arrays.toString(array)); // Kết quả: [1, 2, 3, 4, 5]

    }
}
