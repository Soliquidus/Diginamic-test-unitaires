package ex2;

import org.junit.Test;

/**
 * Classe de test pour tester la classe Maison
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 21/10/2021
 */
public class MaisonTest {

    @Test
    public void ajouterPieceTest(){
        Maison maison = new Maison();
        Cuisine cuisine = new Cuisine(35,0);
        maison.ajouterPiece(cuisine);
    }

    @Test
    public void ajouterPieceNullTest(){
        Maison maison = new Maison();
        maison.ajouterPiece(null);
    }

    @Test
    public void ajouterPieceNegativeTest(){
        Maison maison = new Maison();
        Cuisine cuisine = new Cuisine(-12,0);
        maison.ajouterPiece(cuisine);
    }
}