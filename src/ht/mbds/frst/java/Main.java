package ht.mbds.frst.java;

import ht.mbds.frst.java.models.Joueur;
import ht.mbds.frst.java.models.Personnage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static List<Personnage> person = new ArrayList<>();
    private static Map<Integer, Personnage> index = new HashMap<>();
    
    private static List<Personnage>personevivant=new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("----------Bienvenue dans le jeu de combat realise par CodeMatix-----------");
         
         Scanner sc =new Scanner(System.in);
         System.out.print("Joueuer 1, entre ton nom : ");
         String nom=sc.nextLine();
         
         System.out.print("Joueuer 2, entre ton nom : ");
         String nom2=sc.nextLine();
         
         System.out.println(nom +" cree ton equipe:");
         System.out.print("Nom du personnage 1:");
         String person1=sc.nextLine();
         
         System.out.print("Nom du personnage 2:");
         String person2=sc.nextLine();
         
         System.out.print("Nom du personnage 3:");
         String person3=sc.nextLine();
         
         System.out.println(nom2 +" cree ton equipe:");
         System.out.print("Nom du personnage 1:");
         String person4=sc.nextLine();
         
         System.out.print("Nom du personnage 2:");
         String person5=sc.nextLine();
         
         System.out.print("Nom du personnage 3:");
         String person6=sc.nextLine();

         
         Personnage personnage1=new Personnage(1,person1,100,20);
         Personnage personnage2=new Personnage(2,person2,100,20);
         Personnage personnage3=new Personnage(3,person3,100,20);
         
         Personnage personnage4=new Personnage(4,person4,100,20);
         Personnage personnage5=new Personnage(5,person5,100,20);
         Personnage personnage6=new Personnage(6,person6,100,20);
         
         
         ajouterPersonnage(personnage1);
         ajouterPersonnage(personnage2);
         ajouterPersonnage(personnage3);
         ajouterPersonnage(personnage4);
         ajouterPersonnage(personnage5);
         ajouterPersonnage(personnage6);
         
         Personnage[] equipe = { personnage1, personnage2, personnage3 };
         Joueur joueur1=new Joueur(nom,equipe);
         
          Personnage[] equipe2 = { personnage4, personnage5, personnage6 };
         Joueur joueur2=new Joueur(nom2,equipe2);
         
         
         System.out.println(joueur1.toString()+" First player");
        //    attaquer(personnage1);
        //    personnage1.estVivant();
        //     attaquer(personnage1);
        //    personnage1.estVivant();
        //     attaquer(personnage1);
        //    personnage1.estVivant();
        //     attaquer(personnage1);
        //    personnage1.estVivant();
        //     attaquer(personnage1);
        //    personnage1.estVivant(); attaquer(personnage1);
        //    personnage1.estVivant();

    }

       static void attaquer(Personnage cible){
        if(cible.estVivant()){
            int vierestante= cible.getVie()-cible.getAttaque();
            cible.setVie(vierestante);
            
            System.out.println(cible+" a ete touche. Il perd : "+cible.getAttaque()+" points de vie.");
            
            if(cible.getVie()==0){
                personevivant.remove(cible);
            }
        }
        else{
            System.out.println(cible+"n'a plus de vie");
        }
    }
     
        
      static void ajouterPersonnage(Personnage p) {
        person.add(p);
        personevivant.add(p);
        index.put(p.getId(), p);
    }

    
    
}

