import java.util.*;
public class _134hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
