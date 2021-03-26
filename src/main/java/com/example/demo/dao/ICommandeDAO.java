package com.example.demo.dao;

import com.example.demo.entities.Commande;
import com.example.demo.entities.Composante;
import com.example.demo.entities.User;

public interface ICommandeDAO {
	
	public Commande ChargerCommande(int id);
	
	public void AnnulerCommande(int c);
	
	public void AddComposantetoCommande(Composante c,Commande cmd);
	
	public int ValiderCommande(int idPanier, User c,boolean e,String local);
	
	public void ModifierCommande(int id,String local); 
	
}
