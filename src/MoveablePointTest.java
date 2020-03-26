public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint movablePoint = new MoveablePoint(3.3f, 2.2f, 5.5f, 4.4f);
        System.out.println("Điểm di chuyển trước: "+movablePoint.toString());
        movablePoint.move();
        System.out.println("Điểm di chuyển sau: "+movablePoint.toString());
    }
}
