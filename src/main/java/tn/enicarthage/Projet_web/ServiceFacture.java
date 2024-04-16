package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFacture {

    @Autowired
    private FactureRepository factureRepository;
    
    public Facture saveFacture(Facture facture) {
    	return factureRepository.save(facture) ;
    }

}