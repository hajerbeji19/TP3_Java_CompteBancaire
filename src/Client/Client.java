package Client;
import Compte.Compte;

import java.util.Arrays;

public class Client {
	private Compte[] comptes;
	private String nom;
	private int nbComptes;
	public Client(String nom,int MaxNbComptes) {
		this.comptes=new Compte[MaxNbComptes];
		this.nom=nom;
		this.nbComptes=0;
	}
	public String getNom() {
		return nom;
	}
	public double getSolde() {
		double soldeTotal=0.0;
		for(int i=0;i<nbComptes;i++) {
			soldeTotal=soldeTotal+comptes[i].getSolde();
		}
		return soldeTotal;
	}
	public Compte[] getComptes() {
		return comptes;
	}
	public void afficherSolde() {
		System.out.println("Le solde total de client est égale "+this.getSolde());
	}
	public void ajouterCompte() {
		if(nbComptes<comptes.length) {
			comptes[nbComptes]=new Compte();
			nbComptes++;
		}else {
			System.out.println("Le client atteint le nombre maximal des comptes .");
		}
	}
	@Override
	public String toString() {
		return "Le nom du client"+nom+" ayant "+nbComptes+" comptes"+ "; et ses compte "+Arrays.toString(comptes);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null ||getClass()!=o.getClass()) {
			return false;
		}
		Client other = (Client) o;
		return this.nom==other.nom;
	}
}
