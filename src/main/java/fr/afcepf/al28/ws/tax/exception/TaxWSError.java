package fr.afcepf.al28.ws.tax.exception;

public enum TaxWSError {
    /**
     * Liste de toutes les erreurs.
     */
    /**
     * Erreur g�n�rique.
     */
    CA_NE_FONCTIONNE_PAS,
    /**
     * Ajout dans la base impossible.
     */
    IMPOSSIBLE_AJOUT_DANS_BASE,
    /**
     * Suppression dans la base impossible.
     */
    IMPOSSIBLE_SUPPRESSION_DANS_BASE,
    /**
     * Objet demand� non pr�sent en base.
     */
    RECHERCHE_NON_PRESENTE_EN_BASE,
    /**
     * L'update ne peut �tre faite.
     */
    UPDATE_NON_EFFECTUE_EN_BASE,
}
