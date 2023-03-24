public class Cirlce extends Figure{
    private double radius;

    public Cirlce(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String draw() {
        return this.draw(Color.Green);
    }

    public String draw(Color color) {
        return String.format("Нарисован круг с радиусом:" + this.radius + " с центром в точке " + super.getPerar() + ". Цвет: " + color);

    }
}

