package com.lifan.app.javasrc.gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by LiFan
 * @date 2019/5/7
 */

public class RefTest {

    private static ReferenceQueue<String> rq = new ReferenceQueue<>();

    public static void main(String[] args) throws InterruptedException {
        List<WeakReference> list = new ArrayList<>();

        Thread thread = new Thread(() -> {
            try {
                int cnt = 0;
                WeakReference<byte[]> k;
                while((k = (WeakReference) rq.remove()) != null) {
                    System.out.println((cnt++) + "回收了:" + k);
                    // !!! 我们只收到了一个通知 !!!
                    // 此时 k.get() == null 即此刻指向的对象已经被回收了
                 }
            } catch(Exception e) {
            }
        });
//        thread.setDaemon(false);
        thread.start();

        Thread.sleep(1000);

        for(int i = 0;i < 12;i++) {
            String str = String.valueOf(i);
            WeakReference<String> weakReference = new WeakReference<>(str, rq);
            list.add(weakReference);
        }
        System.gc();

        //结束线程
        Thread.sleep(2000);
        thread.interrupt();
    }
}
