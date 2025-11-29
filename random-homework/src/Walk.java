import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
public class Walk {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 0;
        int y = 0;

        ArrayList directions = new ArrayList<>();
        directions.add("left");
        directions.add("right");
        directions.add("up");
        directions.add("down");

        for (int i = 0; i < 100; i++) {
            String dir = directions.get(random.nextInt(4)).toString();
            switch (dir){
                case "up":
                    y++; break;
                case "down":
                    y--; break;
                case "left":
                    x++; break;
                case "right":
                    x--; break;
            }
        }
        System.out.println( "Final Cordinates: ("+ x + "," + y +")" );
    }
}
