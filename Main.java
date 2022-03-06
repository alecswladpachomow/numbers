package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> outList = new ArrayList();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 &&
                    intList.get(i) % 2 == 0) outList.add(intList.get(i));
        }
        outList.sort(Comparator.naturalOrder());
        outList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
