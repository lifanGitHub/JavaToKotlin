package java_to_kotlin.demo16;

/**
 * @author by LiFan
 * @date 2018/12/11
 */

public class JavaLambda {
    public Interface0 i0;
    public Interface0x i0x;
    public Interface1 i1;
    public Interface2 i2;


    public static void main(String[] args) {
        JavaLambda lambda = new JavaLambda();
        lambda.i0 = () -> System.out.println("hello");
//        lambda.i0 = () -> {System.out.println("hello");};  //等效
        lambda.i0x = () -> "";
    }

    public interface Interface0{
        void fun0();
    }

    public interface Interface0x{
        String fun0x();
    }

    public interface Interface1{
        void fun1();
        void fun2();
    }

    public interface Interface2{
        void fun1();
        void fun2(String s);
    }

}




