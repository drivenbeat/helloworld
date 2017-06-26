/**
 * Created by jm on 2017. 6. 26..
 */
public class PointXY {

    private int x;
    private int y;

    public PointXY(int x, int y) {
        this.x = x;
        this.y = y;

        printf();
    }


    public void setX(int x) {
        this.x = x;

        printf();
    }

    public void setY(int y) {
        this.y = y;

        printf();
    }


    void moveXY(int x, int y){
        this.x += x;
        this.y += y;

        printf();
    }

    void printf(){
        System.out.println("x :" + this.x + " ::: " + "y : "+ this.y);
    }
}
