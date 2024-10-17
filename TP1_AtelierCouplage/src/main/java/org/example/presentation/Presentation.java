package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String [] args){
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        Etudiant e1 = new Etudiant(1,"SBAI","Hiba","sbaihiba@gmail.com");
        Etudiant e2 = new Etudiant(2,"SBAI","Ghita","sbaighita@gmail.com");
        Etudiant e3 = new Etudiant(3,"RAYRAY","Soraya","rayraysoraya@gmail.com");
        Etudiant e4 = new Etudiant( 4,"Casablancas","Julian","casajulian@gmail.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        System.out.println("Avant update : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

        Etudiant etudiantModifie = new Etudiant(4, "CAMUS", "Albert", "camusalbert@gmail.com");
        etudiantManager.updateEtudiant(etudiantModifie);

        System.out.println("Après update : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

    }
}
