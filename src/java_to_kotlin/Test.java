package java_to_kotlin;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author by LiFan
 * @date 2018/7/12
 */

class Test {

    private Map<String,String> mapNull;
    private Map<String,String> map0;
    private Map<String,String> map1 = new LinkedHashMap<>();
    public Map<String,String> map2 = new LinkedHashMap<>();
    public final Map<String,String> map3 = new LinkedHashMap<>();
    public static Map<String,String> map4 = new LinkedHashMap<>();
    public static final Map<String,String> map5 = new LinkedHashMap<>();


    public Test(Map<String, String> map0) {
        this.map0 = map0;
    }

    public static void main(String[] args) {

    }

    public Map<String, String> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, String> map1) {
        this.map1 = map1;
    }
}
