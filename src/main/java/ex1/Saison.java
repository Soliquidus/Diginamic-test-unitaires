package ex1;

/**
 * Représente une des 4 saisons
 *
 * @author RichardBONNAMY
 */
public enum Saison {

    /**
     * Printemps - 1ère saison
     */
    PRINTEMPS("Printemps", 1),
    /**
     * Eté - 2ème saison
     */
    ETE("Eté", 2),
    /**
     * Automne - 3ème saison
     */
    AUTOMNE("Automne", 3),
    /**
     * Hiver - 4ème saison
     */
    HIVER("Hiver", 4);

    /**
     * Libellé de la saison
     */
    private final String libelle;

    /**
     * Ordre de la saison dans l'année
     */
    private final int numero;

    /**
     * Constructeur
     *
     * @param libelle libellé
     * @param numero  numéro d'ordre
     */
    private Saison(String libelle, int numero) {
        this.libelle = libelle;
        this.numero = numero;
    }

    /**
     * Recherche une saison en fonction de son libellé
     *
     * @param libelle libellé
     * @return fr.diginamic.tests.Saison
     */
    public static Saison getSaison(String libelle) throws EnumException {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            if (saison.getLibelle().equals(libelle)) {
                return saison;
            }
        }
        throw new EnumException("Saisie incorrect");
    }

    /**
     * Getter
     *
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Getter
     *
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

}