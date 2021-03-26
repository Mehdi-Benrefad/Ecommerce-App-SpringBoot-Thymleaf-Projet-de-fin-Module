package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Produit;

public interface IProduitDAO {
	
	public void ajouterProduit(Produit p, int idCat);

	public List<Produit> listeproduits();

	public List<Produit> produitsParMotCle(String mc);

	public List<Produit> produitsParCategorie(int idCat);

	public Produit getProduit(int idP);

	public void supprimerProduit(int idP);

	public void modifierProduit(Produit p,int id);

}
