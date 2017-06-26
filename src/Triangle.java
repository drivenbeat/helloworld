/**
 * Created by jm on 2017. 6. 26..
 */
public class Triangle implements Shape {
    int x, y;
    double area;

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void getArea(){
        this.area = this.x + this.y * 0.5;
        System.out.println(area);
    }
}


class Rectangle implements Shape{
    int x, y;
    double area;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void getArea() {
       this.area = this.x + this.y;
        System.out.println(area);
    }
}
