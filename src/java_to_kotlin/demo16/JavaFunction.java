package java_to_kotlin.demo16;

/**
 * @author by LiFan
 * @date 2018/12/12
 */

class JavaFunction {
    public static void main(String[] args) {
        TestFunction function = from -> "Lambda:" + from.toUpperCase();

        System.out.println(JavaFunction.fun("lowCase",function));

    }


    //函数 String变换规则
    @FunctionalInterface
    public interface TestFunction{
        String fun(String from);
//        void fun2();//必须唯一
    }

    //高阶函数
    public static String fun(String str, TestFunction testFunction){
        return testFunction.fun(str);
    }
}
