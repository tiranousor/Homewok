public class rectangle extends Figure {
    private double width;
    private double length;

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth() {
        this.width = width;
    }

    public void setLength() {
        this.length = length;
    }

    public double area() {
        return this.width * this.length;
    }

    public double perimeter() {
        return 2 * (this.width + this.length);
    }

    public String draw() {
        return this.draw(Color.Purple);
    }

    public String draw(Color color) {
        return String.format("Нарисован прямоугольник со сторонами:" + this.width + " и " + this.length + " с центром в точке "
                + super.getPerar() + ". Цвет: " + color);
    }
}