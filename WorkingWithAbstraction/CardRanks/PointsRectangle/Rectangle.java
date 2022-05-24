package WorkingWithAbstraction.PointsRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean toReturn = false;
        if (point.getX() >= this.bottomLeft.getX() && point.getX() <= this.topRight.getX()) {
            if (point.getY() >= this.bottomLeft.getY() ) {
                if (point.getY() <= this.topRight.getY()) {
                    toReturn = true;
                }
            }
        }
        return toReturn;
    }
}
