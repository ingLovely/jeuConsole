package ht.mbds.frst.java.models;


/**
 *
 * @author RL
 */
public class Personnage {
    private String nom;
    private int vie;
    private int id;
    private int attaque;

    public Personnage(int id,String nom, int vie, int attaque) {
        this.id=id;
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + ", attaque=" + attaque + '}';
    }
    
    public boolean estVivant(){
        return this.vie>0;
    }
    
    
}

