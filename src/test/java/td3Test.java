import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class td3Test {

    @Test
    @DisplayName("Test Carré")
    void ex1() {
    assertEquals(9,td3.ex1(-3));
    assertNotEquals(16, td3.ex1(3));
    }

    @Test
    @DisplayName("Test comparaison")
    void ex2() {
        assertEquals(9,td3.ex2(1,9));
        assertNotEquals(13,td3.ex2(14,13));
    }

    @Test
    @DisplayName("Test Somme d'un tableau")
    void ex3() {
    int[] tab =  {1,2,3,4,5} ;
    assertEquals(15,td3.ex3(tab));
    assertNotEquals(14,td3.ex3(tab));

    }
}