public class FigureUtil {
    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static String draw(Drawable figure) {
        return figure.draw();
    }

    public static String draw(Drawable figure, Color color) {
        return figure.draw(color);
    }
}
