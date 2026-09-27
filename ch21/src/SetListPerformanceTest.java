import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetListPerformanceTest {
    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(i);
        Collections.shuffle(list);
    }
}
