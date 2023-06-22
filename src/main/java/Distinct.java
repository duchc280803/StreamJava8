import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

//    distinct(): Loại bỏ các phần tử trùng lặp, và đưa về các phần tử duy nhất.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,9,5,7,4);
        List<Integer> distinctNumber = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumber);
    }
}
