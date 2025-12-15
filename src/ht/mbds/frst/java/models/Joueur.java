package ht.mbds.frst.java.models;


/**
 *
 * @author RL
 */
public class Joueur {
    private String nomUtilisateur;
    private Personnage[] equipe;

    public Joueur(String nomUtilisateur, Personnage[] equipe) {
        this.nomUtilisateur = nomUtilisateur;
        this.equipe = equipe;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public Personnage[] getEquipe() {
        return equipe;
    }

    public void setEquipe(Personnage[] equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Joueur{" + "nomUtilisateur=" + nomUtilisateur + ",\n equipe=" + equipe.toString() + '}';
    }
    
    
}

