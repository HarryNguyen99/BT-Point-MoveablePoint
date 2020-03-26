public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(4.4f, 6.6f);
        System.out.println("point2D: " + point.toString());
        for (double values : point.getXY()) {
            System.out.print(values + "\t");
        }
    }
}
