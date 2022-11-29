package exam_iibdcc_java_1;

import java.util.ArrayList;

public class Impots {
	private int annee;
	private double totalImpot;
	ArrayList<Dossier> listeDesDossiers = new ArrayList<Dossier>();
	public Impots(int annee) {
		super();
		this.setAnnee(annee);
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getTotalImpot() {
		return totalImpot;
	}
	public void setTotalImpot(double totalImpot) {
		this.totalImpot = totalImpot;
	}
	public void add(Dossier ds) {
		this.listeDesDossiers.add(ds);
	}
	public String toString() {
		double total = 0 ;
		String output = "Liste des impots "+this.getAnnee()+"\n";
		for(int i=0;i<this.listeDesDossiers.size();i++) {
			output += listeDesDossiers.get(i).toString()+"\n";
			total+=listeDesDossiers.get(i).getMontant();
		}
		output+="Total : "+total;
		return output;
	}

}
