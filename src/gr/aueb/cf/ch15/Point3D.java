package gr.aueb.cf.ch15;


    public class Point3D extends Point2D {
        private double z;

        public Point3D() {

        }

        public Point3D(double x, double y, double z) {
            super(x, y);
            this.z = z;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        public Point3D(double x, double y) {
            super(x, y);
        }

        @Override
        public void movePlusOne() {
            super.movePlusOne();
            z += 1;
        }

        @Override
        protected void movePlusten() {
            super.movePlusten();
            z += 10;
        }

        @Override
        public String toString() {
            return "{" + getX() + ", " + getY() + "," + z + "}";
        }
    }


