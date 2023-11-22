package Compte;

public class Compte {
	//---------definir les attributs---------
	private int numero;
	private double solde;
	private static final int nbMax=10;
	public static int nbCompte = 0;
	//---------fin des attributs---------
	public Compte(){
		this.numero=numero;
		this.solde=solde;
		nbCompte++;
		
	}
	//---------definir les méthodes---------
	public void depot(double valeur) {
		solde=solde+valeur;
	}
	public void retrait(double valeur) {
		solde=solde-valeur;
	}
	public double getSolde() {
		return solde;
	}
	public void afficherSolde() {
		System.out.println("Solde = "+solde);
	}
	public void setSolde(double s) {
		if(s>=0) {
			solde=s;
		}
		else {
			System.out.println("Le solde doit etre positif !");
		}
	}
	public String toString() {
		return "Le compte de numéro "+numero+" a solde = "+solde;
	}
	//---------fin des méthodes---------
	public void virer(float valeur ,Compte destinataire) {
		if(valeur<=solde) {
			retrait(valeur);
			destinataire.depot(valeur);
		}else {
			System.out.println("Vous n'avez pas ce montant ! ");
		}
	}
	public static Compte plusSolde(Compte c1,Compte c2) {
		if(c1.solde>c2.solde) {
			return c1;
		}
		return c2;
	}
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null ||getClass()!=o.getClass()) {
			return false;
		}
		Compte other = (Compte) o;
		return this.numero==other.numero && this.solde==other.solde;
	}
}
