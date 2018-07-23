package java_to_kotlin.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author by LiFan
 * @date 2018/7/23
 */

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] list2 = new String[]{"X","XX","XXX"};
        list.addAll(Arrays.asList(list2));

        System.out.println("data:" + list.get(1));
        System.out.println("data:" + list2[1]);

    }

}
