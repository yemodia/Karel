import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args){
        int WIDTH = 5;
        int HEIGHT = 7;
        Rectangle rec = new Rectangle(0, 0, WIDTH, HEIGHT);
        System.out.println(rec);
        rec.translate(5, 0);
        System.out.println(rec);
        rec.translate(0, -7);
        System.out.println(rec);
        rec.translate(-5,0 );
        System.out.print(rec);



    }
}
