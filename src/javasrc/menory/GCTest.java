package javasrc.menory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by LiFan
 * @date 2018/8/13
 */

class GCTest {
    public static void main(String[] args) throws InterruptedException {
        List<Data> list = new ArrayList<>();
        int i=0;
        while (true){
            list.add(new Data());
            System.out.println(""+i++);
            Thread.sleep(1);
        }

    }

    static class Data{
        private byte[] c = new byte[1024];
    }
}



