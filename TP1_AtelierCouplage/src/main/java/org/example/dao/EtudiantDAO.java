package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements EtudiantDAOInterface {
    private List<Etudiant> etudiants;

    public EtudiantDAO() {
        etudiants = new ArrayList<>();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiants) {
            if (e.getId() == etudiant.getId()) {
                e.setNom(etudiant.getNom());
                e.setPrenom(etudiant.getPrenom());
                e.setEmail(etudiant.getEmail());
                return e;
            }
        }
        return null;
    }
}