import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class KarelAndCarl {

    public static void main(String[] args){
        City ouaga = new City();

        Robot karel = new Robot(ouaga,0 ,0, Direction.SOUTH, 1);
        Robot carl = new Robot(ouaga, 0, 3, Direction.EAST, 0);

        karel.turnLeft();

        carl.turnLeft();
        carl.turnLeft();

        karel.move();
        karel.move();
        karel.move();
        karel.putThing();

        carl.pickThing();

        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();

        carl.turnLeft();
        carl.move();
        carl.move();
        carl.putThing();

        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();

        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
    }
}
