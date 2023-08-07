public class Q2 {
    public static void main(String[] args) {
        try {
            Rectangle rectangle1 = new Rectangle(); 
            System.out.println("Area: " + rectangle1.getArea()); 
            System.out.println("Perimeter: " + rectangle1.getPerimeter()); 

            Rectangle rectangle2 = new Rectangle(5, 10); 
            System.out.println("Area: " + rectangle2.getArea()); 
            System.out.println("Perimeter: " + rectangle2.getPerimeter()); 

            rectangle2.setDimensions(8, 6); 
            System.out.println("Area: " + rectangle2.getArea()); 
            System.out.println("Perimeter: " + rectangle2.getPerimeter());

            rectangle2.setDimensions(-2, 5);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException() {
        super();
    }

    public NegativeValueException(String message) {
        super(message);
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) throws NegativeValueException {
        setDimensions(length, width);
    }

    public void setDimensions(double length, double width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length or width cannot be negative.");
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

