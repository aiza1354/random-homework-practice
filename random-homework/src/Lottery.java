import java.util.ArrayList;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList randomNumbers = new ArrayList();


        for (int i = 0; i < 6; i++) {
            // generating a random number between 1 and 49.
            int number = random.nextInt(49) + 1;

            // if the array list randomNumbers contains the number generated then we generate another one instead.
            if (randomNumbers.contains(number)) {
                randomNumbers.add(random.nextInt(49) + 1);
                // otherwise, add the number generated.
            } else {
                randomNumbers.add(number);
            }

            // if the number is already in the array list then we generate another random number in place of it. Otherwise we add it to the ArrayList.
            // If an array list doesn't contain the number, we add it to the list. Otherwise we generate anothger random number in place of it.
        }

        randomNumbers.sort(null);

        for (int i = 0; i < randomNumbers.size(); i++) {
            System.out.println(randomNumbers.get(i));
        }
    }
}

