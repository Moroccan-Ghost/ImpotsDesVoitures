package exam_iibdcc_java_1;

public abstract class Dossier {
	private long id;
	private double montant;
	public Dossier(long id) {
		super();
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public abstract void calculerMontant();
}
