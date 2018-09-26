package behavioral_pattern.observer_pattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
