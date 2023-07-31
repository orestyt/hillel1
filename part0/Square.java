package part0;

public class Square implements Figure {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
}
