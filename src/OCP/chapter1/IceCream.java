package OCP.chapter1;

public class IceCream {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        Flavors f = Flavors.STRAWBERRY;

        switch (f.ordinal()) {
            case 0:
                System.out.println("vanilla");
                break;
            case 1:
                System.out.println("chocolate");
                break;
            case 2:
                System.out.println("strawberry");
                break;
            default:
                System.out.println("missing flavor");
        }
    }
}
