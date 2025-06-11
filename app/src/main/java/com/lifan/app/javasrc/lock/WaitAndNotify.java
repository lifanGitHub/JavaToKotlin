package com.lifan.app.javasrc.lock;

/**
 * @author by LiFan
 * @date 2018/8/10
 * 线程1 wait()且放下锁-》线程2拿到锁-》线程2通知线程1取消阻塞-》线程2持有obj的锁 所以线程1不能执行继续阻塞
 * 线程2结束->线程2放弃锁-》线程1拿到锁-》线程1执行
 */

public class WaitAndNotify {
    public static void main(String[]args)throws Exception {
        final Object obj = new Object();
        new Thread(() -> {
            synchronized (obj) {
                try {
                    obj.wait();
                    System.out.println("Thread 1 wake up.");
                } catch (InterruptedException e) {
                }
            }
        }).start();

        Thread.sleep(1000);//We assume lock 1 must start up within 1 sec.

        new Thread(() -> {
            synchronized (obj) {
                obj.notifyAll();
                System.out.println("Thread 2 sent notify.");
            }
        }).start();
    }





}

