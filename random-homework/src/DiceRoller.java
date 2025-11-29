import java.util.Random;
public class DiceRoller {
    public static void main (String [] args) {
        Random random = new Random();

        int randomNum1 = random.nextInt(6) + 1;
        int randomNum2 = random.nextInt(6) + 1;
        int result = randomNum1 + randomNum2;
        System.out.println(randomNum1 + " + " + randomNum2  + "  =  " + result );

    }



}
