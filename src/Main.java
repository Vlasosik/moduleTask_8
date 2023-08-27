public class Main {
    public static void main(String[] args) {
        DrawShapes circle = new DrawShapes.Circle(5);
        circle.draw();
        System.out.println(circle);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");
        DrawShapes square = new DrawShapes.Square(7.0);
        square.draw();
        System.out.println(square);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");
        DrawShapes rectangle = new DrawShapes.Rectangle(10,15);
        rectangle.draw();
        System.out.println(rectangle);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");
        DrawShapes triangle = new DrawShapes.Triangle(9.5, 11.00);
        triangle.draw();
        System.out.println(triangle);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");
        DrawShapes diamond = new DrawShapes.Diamond(8.0, 10.0);
        diamond.draw();
        System.out.println(diamond);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");
        DrawShapes star = new DrawShapes.Star();
        star.draw();
        System.out.println(star);
        System.out.println("-----------------------------------------------------------------------------------------" +
                "-----------------------------");

    }
}
