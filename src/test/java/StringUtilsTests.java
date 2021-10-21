import ex3.StringUtils;
import ex3.StringUtilsException;
import org.junit.Test;

/**
 * Classe de test pour les tests sur StringUtils
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 21/10/2021
 */
public class StringUtilsTests {

    @Test
    public void levenshteinDistanceTest() throws StringUtilsException {
        StringUtils.levenshteinDistance("Chien", "Chine");
    }

    @Test(expected = StringUtilsException.class)
    public void levenshteinDistanceVideTest() throws StringUtilsException{
        StringUtils.levenshteinDistance("", "");
    }

    @Test(expected = StringUtilsException.class)
    public void levenshteinDistanceNullTest() throws StringUtilsException {
        StringUtils.levenshteinDistance(null, null);
    }

    @Test(expected = StringUtilsException.class)
    public void levenshteinDistanceChiffresTest() throws StringUtilsException {
        StringUtils.levenshteinDistance("1218589", "12335");
    }
}