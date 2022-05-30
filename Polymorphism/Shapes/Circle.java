package Polymorphism.Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2* Math.PI * this.radius;
    }

    @Override
    public Double calculateArea() {
        return this.radius*this.radius*Math.PI;
    }

    public final Double getRadius() {
        return radius;
    }
}
