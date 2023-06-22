import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingChuyenKieu {

//    map(Function<T, R> mapper): phương thức quan trọng được sử dụng để chuyển đổi dữ liệu từ
//    một định dạng sang một định dạng khác.
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Đức","Hùng","Nguyên","Phong","Minh");
        List<Integer> nameLength = name.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
