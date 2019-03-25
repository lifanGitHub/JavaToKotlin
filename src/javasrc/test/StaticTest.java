package javasrc.test;

/**
 * @author by wuYang
 * @date 2019/3/25
 * @describe
 * 对象的初始化是先初始化成员变量再执行构造方法
 */

class StaticTest {
    public static void main(String[] args)
    {
        staticFunction();
    }

    static StaticTest st = new StaticTest();

    static
    {//1
        System.out.println("1");
    }

    {//2
        System.out.println("2");
    }

    StaticTest()
    {//3
        System.out.println("3");
        System.out.println("a="+a+",b="+b);//0  112
    }

    public static void staticFunction(){//4
        System.out.println("4");
    }

    int a=110;
    static int b =112;
}
