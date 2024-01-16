public class Circle extends Figure {
    //круг
    private double radius;

    // Конструктор

    public Circle(double radius) {
        this.radius = radius;
    }

    double pi = 3.14;

    @Override
    public double square() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
