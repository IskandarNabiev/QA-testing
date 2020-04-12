public class Vector3d extends AbstractVector{

    private double a, b, c;
    public Vector3d(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Vector3d sumVec3d(Vector3d x) {
        return new Vector3d(
                this.getA() + x.getA(),
                this.getB() + x.getB(),
                this.getC() + x.getC()
        );
    }

    public Vector3d subVec3d(Vector3d x) {
        return new Vector3d(
                this.getA() - x.getA(),
                this.getB() - x.getB(),
                this.getC() - x.getC()
        );
    }

    public double scalar3d(Vector3d x) {
        return a * x.getA() + b * x.getB() + c * x.getC();
    }

    @Override
    public String toString() {
        return "Vector3d {a=" + a + ", b=" + b + ", c=" + c + "}";
    }

    @Override
    public Vector2d sumVec(Vector2d x) {
        return null;
    }

    @Override
    public Vector2d subVec(Vector2d x) {
        return null;
    }

    @Override
    public double scalar(Vector2d x) {
        return 0;
    }

}
