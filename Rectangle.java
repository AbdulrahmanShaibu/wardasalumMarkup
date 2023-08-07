
public class NegativeValueException extends Exception {
    public NegativeValueException() {
        super();
    }

    public NegativeValueException(String message) {
        super(message);
    }
}



// Rectangle.java
public class Rectangle {
    private double length;

    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double length, double width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length and width must be non-negative.");
        }
        this.length = length;
        this.width = width;
    }

    public void setDimensions(double length, double width) throws NegativeValueException {

        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length and width must be non-negative.");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
