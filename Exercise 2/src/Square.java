class Square extends Rectangle {
    private double side;

    public Square(String color, double side) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}