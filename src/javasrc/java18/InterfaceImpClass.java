package javasrc.java18;

/**
 * @author by LiFan
 * @date 2019/2/25
 */

class InterfaceImpClass implements Interface{

    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        new InterfaceImpClass().defaultMethod();
        Interface.staticMethod();
    }

}
