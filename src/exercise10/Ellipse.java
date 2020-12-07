package exercise10;

public class Ellipse extends Figure{

    public Ellipse() {
        super(new Point(0, 0));
    }

    public Ellipse(Point startPoint, double a, double b) {
        super(new Point(startPoint));
    }

    public Ellipse(Ellipse otherEllipse) {
        super(new Point(otherEllipse.startPoint));
    }
    @Override
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (a + b) - Math.sqrt((3.0 * a + b) * (a + 3.0 * b)));
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }

    @Override
    public String getType() {
        return (a == b) ? "Circle" : "Ellipse";
    }

    @Override
    public boolean equal(Ellipse otherEllipse) {
        if (otherFigure instanceof Ellipse) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

    @Override
    public boolean containsClick(Point click) {

        double clickX = click.getX();
        double clickY = click.getY();
        double centerX = startPoint.getX()+side1;
        double centerY = startPoint.getY()+side2;
        double part1 =(Math.pow(clickX-centerX,2))/(side1*side1);
        double part2 =(Math.pow(clickY-centerY,2))/(side2*side2);

        return part1 + part2 <= 1;
    }   
}
