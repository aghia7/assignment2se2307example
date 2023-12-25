package models;

public class Triangle extends NamedShape {
    private double a;
    private double b;
    private double c;

    public Triangle() {

    }

    public Triangle(String name, double a, double b, double c) {
        super(name);
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name=" + getName() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
