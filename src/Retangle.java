public class Retangle extends Shape {

    private double width = 1.0;
    private double height = 1.0;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.width*this.height;
        return area;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + height +
                " area = " + getArea() +
                '}';
    }
}
