public class Square extends Shape implements Colorable {

    private double side;

    public Square() {
        this.side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        double area = this.side*this.side;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area = " + getArea() +
                '}';
    }
}
