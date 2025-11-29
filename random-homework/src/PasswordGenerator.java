import java.util.Random;
public class PasswordGenerator {
    public static void main (String [] args) {
        Random rand = new Random ();
        String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!£$%^&*()_1234567890";
        StringBuilder sb = new StringBuilder ();

        for (int i = 0; i < 15; i++) {
            int index = rand.nextInt(password.length());
            sb.append(password.charAt(index));

        }

        System.out.println("Random password: has been generated   -    " + sb.toString());

    }





}
