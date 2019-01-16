package javasrc.lock;

/**
 * @author by LiFan
 * @date 2018/8/13
 */

class WaitAndSleep {
    private static void synSleep(final Object object){
        //Sleep 不放弃锁 所以第二个线程必须等待sleep结束
        synchronized (object) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void synWait(final Object object){
        //Sleep 不放弃锁 所以第二个线程必须等待sleep结束
        synchronized (object) {
            try {
                object.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final Object obj = new Object();
        final long time = System.currentTimeMillis();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                synSleep(obj);
                synWait(obj);
                System.out.println(System.currentTimeMillis() - time);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
//                synSleep(obj);
                synWait(obj);
                System.out.println(System.currentTimeMillis() - time);
            }
        }).start();


    }
}
