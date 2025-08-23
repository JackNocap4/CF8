package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }
    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void movePlusOne() {
        x += 1;
    }

    protected void movePlusTen() {  /// επειδή θέλω να κληρονομηθεί δεν την κάνω private. Protected σημαίνει ότι μόνο η derived κλάση την κληρονομεί.
        x +=10;
    } // επιπλέον λειτουργικότητα αλλά όχι και public = protected

    private void Reset() {  // δεν κληρονομείται.
        x = 0;
    }

    @Override
    public String toString() {
        return "{" + x + "}"; ////
    }
}


