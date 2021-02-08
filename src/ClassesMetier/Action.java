/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int id;
    private String nom;
    private double coursReel;
    private double prixAchat;
    private int quantite;
    
    public Action(int id, String nom, double coursReel, double prixAchat, int quantite)
    {
        this.id = id;
        this.nom = nom;
        this.coursReel = coursReel;
        this.prixAchat = prixAchat;
        this.quantite = quantite;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the coursReel
     */
    public double getCoursReel() {
        return coursReel;
    }

    /**
     * @return the prixAchat
     */
    public double getPrixAchat() {
        return prixAchat;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }
    
}
