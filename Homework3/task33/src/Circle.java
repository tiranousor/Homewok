public class Circle {
    private final double radius;
    private final String color;
     public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }
    public double perimeter() {
        return Math.PI*(2*radius);
    }
     public String toString() {
         return String.format("{ Радиус: %s; Цвет: %s; Площадь: %s; Периметр: %d }", radius, color, area(), perimeter());
     }
}
