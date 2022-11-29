package exam_iibdcc_java_1;

public class DossierRevenus extends Dossier{
	private double ca;

	public DossierRevenus(long id,double ca) {
		super(id);
		this.setCa(ca);
	}
	@Override
	public void calculerMontant() {
		this.setMontant((this.getCa()*15)/100);
	}
	public String toString() {
		this.calculerMontant();
		return "15% de revenus "+this.getCa()+": "+this.getMontant();
	}
	public double getCa() {
		return ca;
	}
	public void setCa(double ca) {
		this.ca = ca;
	}
}
