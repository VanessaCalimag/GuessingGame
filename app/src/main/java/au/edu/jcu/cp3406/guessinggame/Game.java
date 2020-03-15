package au.edu.jcu.cp3406.guessinggame;

// A Java program to demonstrate random number generation
// using java.util.Random;

import java.util.Random;

public class Game extends MainActivity {
    public int number;

    public Game() {
        Random random = new Random();
        number = random.nextInt(11);
    }

    public boolean check(int numberToGuess) {
        return number == numberToGuess;
    }
}
