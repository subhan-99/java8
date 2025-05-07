package StreamAPI;

import java.util.*;
import java.util.stream.*;

public class WithStream {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {  // Fixed 'inti' and 'i' usage
            l1.add(i);
        }

        System.out.println("Original list: " + l1);

        List<Integer> l2 = l1.stream()
                             .filter(i -> i % 2 == 0)
                             .collect(Collectors.toList());

        System.out.println("Even numbers: " + l2);
    }
}
