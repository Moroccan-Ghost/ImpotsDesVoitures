package exam_iibdcc_java_1;

import java.util.ArrayList;

public class Societe {
	private long id;
	private String raison_social;
	ArrayList<Impots> listeDesImpots = new ArrayList<Impots>();
	public Societe(long id, String raison_social) {
		super();
		this.setId(id);
		this.setRaison_social(raison_social);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRaison_social() {
		return raison_social;
	}
	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}
	
	public Impots getImpots(int annee) {
		for (int i = 0; i < listeDesImpots.size(); i++) {
			if(listeDesImpots.get(i).getAnnee()==annee) {
				return listeDesImpots.get(i);
			}
		}
		return null;	
	}
	
	public void addImpots(Impots imp) {
		this.listeDesImpots.add(imp);
	}
	
	@Override
	public String toString() {
		return "Societe: " + id + " - " + raison_social + "\n";
	}
}
