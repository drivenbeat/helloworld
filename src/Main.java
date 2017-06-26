import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Ex3_1 e1 = new Ex3_1();

        e1.test();

        Ex3_2 e2 = new Ex3_2();

        e2.test();


        PointXY pxy = new PointXY(2,3);

        pxy.setX(5);
        pxy.moveXY(10, 10);


        Shape shape1 = new Triangle(10, 20);
        shape1.getArea();
        Shape shape2 = new Rectangle(10, 20);
        shape2.getArea();

        int a = 100;

        for (int i = 0; i < a ; i++) {
            System.out.println(i);
        }



    }
}