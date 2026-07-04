package OCP.chapter2.quest2;

public interface CanWalk {
    default void walk() { System.out.println("Walking"); }
}

interface CanRun {
    public default void walk() { System.out.println("Running"); }
    public abstract void run();
}

interface CanSprint extends CanWalk, CanRun {
    void sprint();

//    @Override
//    default void run() {
//
//    }

    @Override
    default void walk() {
        CanWalk.super.walk();
        CanRun.super.walk();
    }
}
