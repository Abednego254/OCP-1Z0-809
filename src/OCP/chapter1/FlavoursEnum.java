package OCP.chapter1;

public class FlavoursEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }
    public static void main(String[] args) {
        System.out.println(Flavors.STRAWBERRY.ordinal());
    }
}
