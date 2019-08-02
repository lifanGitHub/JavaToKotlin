package javasrc.Thread;

/**
 * @author by LiFan
 * @date 2019/7/30
 * 结束线程的三种方式
 * 1.标志位
 * 2.interrupt
 * 3.stop
 */

class StopThread {
    public static void main(String[] args) {
        thread.start();
        sleep(2000);
//        thread.stop();
        thread.interrupt();

    }

    static Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while (true){
//                    Thread.sleep(500);
                    System.out.println(Thread.interrupted());
                }
            } catch (Exception e) {
                System.out.println(e.getClass().getSimpleName());
                System.out.println(Thread.interrupted());
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    });

    private static void sleep(long n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(){
        sleep(2000);
    }



}
