public class cvadrat extends Figure {
    private double length;

    public cvadrat( double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public double area() {
        return this.length * this.length;
    }

    public double perimeter() {
        return 4*this.length;
    }

    public String draw() {
        return this.draw(Color.Copper);
    }

    public String draw(Color color) {
        return String.format("Нарисован прямоугольник со стороной:" + this.length + " с центром в точке "
                + super.getPerar() + ". Цвет: " + color);
    }
}