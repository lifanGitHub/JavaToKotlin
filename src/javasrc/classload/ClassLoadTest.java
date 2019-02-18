package javasrc.classload;

/**
 * @author by LiFan
 * @date 2019/2/13
 */

class ClassLoadTest {
    public static void main(String[] args) throws Exception{
        A a;
        step();

        print(A.class.getSimpleName());
        step();

        print(new A[20].length);
        step();

        print(A.num);
//        print(A.num2);//num2不行 原理很简单
        step();

        Class.forName("javasrc.classload.A");
        step();

    }

    static int x = 1;
    static void step(){
        System.out.println("step " + x++);
    }
    static void print(Object o){
        System.out.println(o);
    }

}
