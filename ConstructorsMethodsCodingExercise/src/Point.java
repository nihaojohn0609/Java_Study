public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - getX()) * (point.x - getX()) + (point.y - getY()) * (point.y - getY()));
    }
}
