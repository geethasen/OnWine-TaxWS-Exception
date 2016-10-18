package fr.afcepf.al28.ws.tax.exception;

public class TaxWSException extends Exception{

	/**
	 * Seialization Id.
	 */
	private static final long serialVersionUID = 1L;
	
	private TaxWSError erreur;

	public TaxWSError getErreur() {
		return erreur;
	}

	public void setErreur(TaxWSError erreur) {
		this.erreur = erreur;
	}

	public TaxWSException(TaxWSError erreur, String message) {
		super(message);
		this.erreur = erreur;
	}

	public TaxWSException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
