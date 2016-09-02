package module4.webinar.polymorphism;

public class Main {

    static void draw(Figure figure) {
        //if(/*cyrcle*/) ...
        //if(/*cyrcle*/) ...
        figure.drawFigure();
    }

    public static void main(String[] args) {
        //
        Figure circle = new Circle();
        //

        Figure square = new Square();

        Triangle triangle = new Triangle();

        draw(triangle);
    }
}
