import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    Personne abou = new Personne("Mamane","Aboubacar","270699");

    @BeforeEach
    void instance(){
        abou.setNom("Mamane");
        abou.setPrenom("Aboubacar");
        abou.setDateDeNaissance("270699");
    }

    @Test
    void getDateDeNaissance() {
assertEquals(abou.getDateDeNaissance(), "270699");
assertNotEquals(abou.getDateDeNaissance(),"");
    }

    @Test
    void getNom() {
assertEquals(abou.getNom(),"Mamane");
assertNotEquals(abou.getNom(),"");
    }

    @Test
    void getPrenom() {
assertEquals(abou.getPrenom(),"Aboubacar");
assertNotEquals(abou.getPrenom(),"");
    }

    @Test
    void setDateDeNaissance() {
    abou.setDateDeNaissance("110198");
    assertNotEquals("270699", abou.getDateDeNaissance());
    assertEquals("110198", abou.getDateDeNaissance());
    }

    @Test
    void setNom() {
        abou.setNom("Ibrahim");
        assertNotEquals(abou.getNom(),"Mamane");
        assertEquals(abou.getNom(),"Ibrahim");
    }

    @Test
    void setPrenom() {
        abou.setPrenom("Ben");
        assertNotEquals(abou.getNom(),"Aboubacar");
        assertEquals(abou.getPrenom(),"Ben");
    }

}