package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDepense {
	
	@Autowired
    private DepenseRepository depenseRepository;
	
	public Depense saveDepense(Depense depense) {
		return depenseRepository.save(depense); 
		
	}

}
