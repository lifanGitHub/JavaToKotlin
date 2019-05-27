package workspace;

/**
 * @author by LiFan
 * @date 2019/1/17
 */

class WorkRun {
    public static void main(String[] args) {

        new WorkRun().setLambda(() -> {
            System.out.println("OK");
        });
    }

    public void setLambda(InterfaceX interfaceX){
        interfaceX.doIt();
    }
    //不可以追加 因为lambda 类型一致
//    public void setLambda(Runnable runnable){
//        runnable.run();
//    }

    @FunctionalInterface
    public interface InterfaceX {
        void doIt();
    }

}

