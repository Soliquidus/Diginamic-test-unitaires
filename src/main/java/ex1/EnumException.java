package ex1;

/**
 * Classe qui sert à s'occuper des exceptions de la classe Saison
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 21/10/2021
 */
public class EnumException extends Exception{
    public EnumException(String message){
        super(message);
    }
}