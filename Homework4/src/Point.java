import java.util.Scanner;
public class Point {
    private double x;
    private double y;
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(){
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(){
        this.y = y;
    }
    public String toString() {
        return String.format( "(%.2f, %.2f)", this.x, this.y);
    }
}