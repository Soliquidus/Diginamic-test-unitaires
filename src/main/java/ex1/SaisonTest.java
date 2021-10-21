package ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test pour la classe d'énumération Saison
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 21/10/2021
 */
public class SaisonTest {

//    Étape 2/3
    @Test
    public void testLibelle() throws EnumException {
        Saison hiver = Saison.getSaison("Hiver");
        assertEquals(Saison.HIVER, hiver);
    }
//    Étape 4
    @Test(expected = EnumException.class)
    public void testLibelleInexistant() throws EnumException {
        Saison.getSaison("Nope");
    }
//    Étape 5
    @Test(expected = EnumException.class)
    public void testLibelleNull() throws EnumException {
        Saison saison = Saison.getSaison(null);
        assertEquals(null, saison);
    }
}