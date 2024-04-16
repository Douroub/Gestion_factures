package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRevenu {
	@Autowired
    private RevenuRepository revenuRepository;
	
	public Revenu saveRevenu(Revenu revenu) {
		return revenuRepository.save(revenu); }

}
