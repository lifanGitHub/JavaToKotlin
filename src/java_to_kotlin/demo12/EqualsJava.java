package java_to_kotlin.demo12;

import java.util.HashSet;
import java.util.Set;

/**
 * @author by LiFan
 * @date 2018/8/27
 */

class EqualsJava {
    public EqualsJava(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EqualsJava){
            return ((EqualsJava) obj).n == n;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(n).hashCode();
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new EqualsJava(3));
        System.out.println(set.contains(new EqualsJava(3)));
    }

    public int n;


}
