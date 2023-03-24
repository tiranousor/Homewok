public abstract class Figure implements Drawable{
    private Point perar = new Point();

    public Point getPerar(){
        return perar;
    }

    public void setPerar(Point perar){
        this.perar = perar;
    }

    public abstract double area();
    public abstract double perimeter();
}
