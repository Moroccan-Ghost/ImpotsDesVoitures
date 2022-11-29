package exam_iibdcc_java_1;

public class DossierVehicule extends Dossier{
	
	private int nbChevaux;
	private char categorie;
	
	public DossierVehicule(long id,int nbChevaux,char categorie) {
		super(id);
		this.setCategorie(categorie);
		this.setNbChevaux(nbChevaux);
	}
	@Override
	public void calculerMontant() {
		double result = 0;
		char category = this.getCategorie();
		int nbrChevaux = this.getNbChevaux();
		if(category=='E') {
			if(nbrChevaux<8) {
				result = 350.0;
			}else if(nbrChevaux<11) {
				result = 650.0;
			}else if(nbrChevaux<15) {
				result = 3000.0;
			}else {
				result = 8000.0;
			}
		}
		if(category=='G') {
			if(nbrChevaux<8) {
				result = 700.0;
			}else if(nbrChevaux<11) {
				result = 1500.0;
			}else if(nbrChevaux<15) {
				result = 6000.0;
			}else {
				result = 20000.0;
			}
		}
		this.setMontant(result);
	}
	@Override
	public String toString() {
		this.calculerMontant();
		return "Vehicule "+this.getCategorie()+" "+this.getNbChevaux()+" CH, montant:"+this.getMontant();
	}
	public int getNbChevaux() {
		return nbChevaux;
	}
	public void setNbChevaux(int nbChevaux) {
		this.nbChevaux = nbChevaux;
	}
	public char getCategorie() {
		return categorie;
	}
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}
}
