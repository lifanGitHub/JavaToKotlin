package leet_code;

/**
 * @author by LiFan
 * @date 2018/9/28
 */

class Test {
    public static void main(String[] args) {
        for (int i = 1;i<Integer.MAX_VALUE;i++){
            int x = Integer.MAX_VALUE * i;
            if (x > 0){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }

    }



}
