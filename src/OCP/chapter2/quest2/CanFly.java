package OCP.chapter2.quest2;


public interface CanFly {
    void fly();
}

interface HasWings extends CanFly {
    public abstract Object getWingSpan();
}
abstract class Falcon implements CanFly, HasWings {
}
