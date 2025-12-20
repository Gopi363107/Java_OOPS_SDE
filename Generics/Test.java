import java.util.*;
class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println(key + " : " + value);
    }
}

public class Test {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "Gopi");
        Pair<Integer, String> p1 = new Pair<>(2, "Athi");
        p.show();
        p1.show();
    }
}
