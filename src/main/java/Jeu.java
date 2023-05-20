import java.util.ArrayList;

public class Jeu {
    public static void main(String[] args) {
        for (int i = 1;i<=100;i++) {
        System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz (int nombre) {
            String ajout = "";
            if (nombre%3 == 0) {
                if (nombre%5 == 0) {
                    ajout = "FizzBuzz";
                } else ajout = "Fizz";
            } else if (nombre%5 == 0) ajout = "Buzz";
            else ajout = nombre + "";

        return ajout;
    }



}
