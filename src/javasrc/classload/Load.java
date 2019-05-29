package javasrc.classload;

/**
 * @author by wuYang
 * @date 2019/3/25
 * @describe
 * 对象的初始化是先初始化成员变量再执行构造方法
 */

class Load {
    public static void main(String[] args)
    {
        staticFunction();
    }

    static Load st = new Load();

    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    Load()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }

    public static void staticFunction(){//4
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}
