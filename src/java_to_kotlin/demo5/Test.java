package java_to_kotlin.demo5;

/**
 * @author by LiFan
 * @date 2018/7/23
 */

class Test {
    public static void main(String[] args) {
        Integer first = new Test().max2(1,2);
        Integer second = Test.max(1,2);
    }


    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public int max2(int a, int b) {
        return a >= b ? a : b;
    }
}
