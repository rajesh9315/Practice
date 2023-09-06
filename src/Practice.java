import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 5, 50, 60, 85, 89);

        List<Integer> even = list.stream().filter(x->x%2!=0).collect(Collectors.toList());

        System.out.println(even);
    }
}
