package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements EtudiantDAOInterface {
    private Map<Integer, Etudiant> etudiantsMap;

    public EtudiantDAODictionary() {
        etudiantsMap = new HashMap<>();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantsMap.values());
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        if (etudiantsMap.containsKey(etudiant.getId())) {
            etudiantsMap.put(etudiant.getId(), etudiant);
            return etudiant;
        }
        return null;
    }

}
