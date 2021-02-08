/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    private int id;
    private String nom;
    private ArrayList<Action> lesActions;
    
    public Trader(int id, String nom)
    {
        this.id = id;
        this.nom = nom;
        lesActions = new ArrayList<>();
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
     * @return the lesActions
     */
    public ArrayList<Action> getLesActions() {
        return lesActions;
    }

}
