package org.example.dao;

import java.util.List;

public interface EtudiantDAOInterface {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant updateEtudiant(Etudiant etudiant);
}
