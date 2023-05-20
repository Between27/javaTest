import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeuTest {

    @Test

    void fizzBuzz1() {
    assertEquals("1",Jeu.fizzBuzz(1));
    assertNotEquals("2",Jeu.fizzBuzz(5));
    assertEquals("Fizz",Jeu.fizzBuzz(3));
    assertEquals("FizzBuzz",Jeu.fizzBuzz(15));
    }



}