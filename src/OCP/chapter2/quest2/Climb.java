package OCP.chapter2.quest2;

public interface Climb {
    boolean isTooHigh(int height, int limit);
}

class Climber {
    public static void main(String[] args) {
        check((h, l) -> h > l, 5); // x1
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    }
}
