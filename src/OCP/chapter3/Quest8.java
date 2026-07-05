package OCP.chapter3;

import java.util.TreeSet;

public class Quest8 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
