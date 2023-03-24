public class triangle extends Figure{
    private double AB;
    private double AC;
    private double BC;
    public triangle(double AB, double AC, double BC){
        this.AB = AB;
        this.AC = AC;
        this.BC = BC;
    }

    public double getAB() {
        return AB;
    }

    public double getAC() {
        return AC;
    }

    public double getBC() {
        return BC;
    }

    public void setAB(double AB) {
        this.AB = AB;
    }

    public void setAC(double AC) {
        this.AC = AC;
    }

    public void setBC(double BC) {
        this.BC = BC;
    }
    public double perimeter(){
        return this.AB + this.AC + this.BC;
    }
    public double area(){
        double p;
        p = perimeter()/2;
//        System.out.println(p);
        return Math.sqrt(p*(p-this.AB)*(p - this.AC)*(p - this.BC));
    }
    public String draw() {
        return this.draw(Color.Brown);
    }
    public String draw(Color color) {
        return String.format("Нарисован прямоугольник со сторонами:" + this.AB + " и " + this.AC + " и " + this.BC + " с центром в точке "
                + super.getPerar() + ". Цвет: " + color);
    }


}
