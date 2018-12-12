package java_to_kotlin.demo16;

/**
 * @author by LiFan
 * @date 2018/12/11
 */

public class JavaLambda {
    public Interface0 i0;
    public Interface1 i1;
    public Interface2 i2;
    public InterfaceX ix;
//    public InterfaceY i2;


    public static void main(String[] args) {
        JavaLambda lambda = new JavaLambda();
        lambda.i0 = () -> System.out.println("hello") ;
//        lambda.i0 = () -> {System.out.println("hello");};  //等效
        lambda.i1 = () -> "";
//        lambda.i1 = () -> { return "" ;};                  //等效
        lambda.i2 = (s,s2) -> "";
//        lambda.i2 = (s,s2) -> { return "" ;};              //等效

        //lambda不允许
//        lambda.ix = () -> System.out.println("hello") ;
    }

    public interface Interface0{
        void fun0();
    }

    public interface Interface1 {
        String fun1();
    }

    public interface Interface2 {
        String fun2(String s1,String s2);
    }

    public interface InterfaceX {
        void funX1();
        String funX2(String s1,String s2);
    }

}




