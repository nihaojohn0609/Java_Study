public class AreaCalculator {

    public static void main(String[] args) {

    }

    public static double area(double radius) {

//        if(radius < 0) {
//            return -1.0;
//        } else {
//            return radius * radius * Math.PI;
//        }
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
//        if(x < 0 || y < 0) {
//            return -1.0;
//        } else {
//            return x * y;
//        }
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}
