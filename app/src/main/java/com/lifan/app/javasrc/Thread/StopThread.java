package com.lifan.app.javasrc.Thread;

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
        DemoThread thread = new DemoThread();
        thread.start();
        sleep(2000);

        //标志位打断
        thread.setStopFlag();
        //不能打断非等待状态的线程
//        thread.interrupt();
        //弃用不推荐
//        thread.stop();
    }

    static class DemoThread extends Thread{
        private boolean stopFlag;
        @Override
        public void run() {
            try {
                while (!stopFlag){
                    Thread.sleep(500);
                    System.out.println(Thread.interrupted());
                }
            } catch (Exception e) {
                System.out.println(e.getClass().getSimpleName());
                System.out.println(Thread.interrupted());
                System.out.println(Thread.currentThread().isInterrupted());
            }finally {
                //做一些清理
            }
        }
        public void setStopFlag() {
            this.stopFlag = true;
        }
    }

    private static void sleep(long n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
