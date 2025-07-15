package gr.aueb.cf.ch15;

  public class Point2D extends Point {
        private double y;


    public Point2D() {           // κληρονομεί μόνο τους getters και setters.
       // super();               // 1η εντολή. Το super είναι κλήση της από πάνω κλάσης(parent). και να μη δώσω super το δίνει αυτόματα η Java.
      //  y = 0;                 // αρχικοποιεί και το δικό της μέρος.
    }

    public Point2D(double x, double y) {
        super(x) ;    // καλεί ρητά τον υπερφορτωμένο constructor. Αν ο constructor είναι private δεν κληρονομείται.
        // setX(x) ;
        this.y = y;
    }

      public double getY() {
          return y;
      }

      public void setY(double y) {
          this.y = y;
      }

      @Override // annotation. Δεν είναι υποχρεωτικό. Για compile time safety.
      public void movePlusOne() { //Liskov principle. Αν κληρονομήσω κάτι public δε μπορώ να το δώσω μετά private.
          super.movePlusOne();
          y += 1;
      }

      @Override
      protected void movePlusten() {
          super.movePlusten();
          y += 10;
      }

      @Override
      public String toString() {
//          return super.toString() + "{" + y + "}";
          return "{" + getX() + ", " + y + "}";
      }
  }
