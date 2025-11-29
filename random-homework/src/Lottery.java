import java.util.ArrayList;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList randomNumbers = new ArrayList();

        // keep generating a number until the array randomNumbers is full (with 6 numbers).
        while (randomNumbers.size() < 6) {
            // generating a random number between 1 and 49.
            int number = random.nextInt(49) + 1;

            // if randomNumbers doesn't contain "number" then add it.
            if (!randomNumbers.contains(number)) {
                randomNumbers.add(number);

            }
        }
        // sort randomNumbers in ascending order
        randomNumbers.sort(null);

        // print the sorted numbers by looping through all the random numbers.
        for (int i = 0; i < randomNumbers.size(); i++) {
            System.out.println(randomNumbers.get(i));
        }
    }
}

