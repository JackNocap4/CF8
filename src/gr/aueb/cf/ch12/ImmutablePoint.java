package gr.aueb.cf.ch12;

public class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {   // δεν υπάρχουνε setters.
        return x;
    }

    public int getY() {
        return y;
    }

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

}
