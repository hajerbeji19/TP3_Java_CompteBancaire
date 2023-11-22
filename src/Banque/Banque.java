package Banque;
import Client.Client;

public class Banque {
	public static void main(String[] args) {
		Client client1 = new Client("Mohamed", 3);
        Client client2 = new Client("Ali", 2);
        
        client1.ajouterCompte();
        client2.ajouterCompte();
        client2.ajouterCompte();
        
        client1.getComptes()[0].depot(5000);
        client2.getComptes()[0].depot(3000);
        client2.getComptes()[0].depot(2000);
        
        client2.getComptes()[0].retrait(200);
        client1.getComptes()[0].virer(100, client2.getComptes()[0]);
        
        System.out.println("Des informations sur client1 : "+client1);
        System.out.println("Des informations sur client2 : "+client2);
        
        
        System.out.println("Solde total du client 1 : " + client1.getSolde());
        System.out.println("Solde total du client 2 : " + client2.getSolde());
        System.out.println("égalité entre les clients 1 et 2 : " + client1.equals(client2));
	}
}
