package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceRapport {
	@Autowired
    private RapportRepository rapportRepository;

    public Rapport saveRapport(Rapport rapport) {
        return rapportRepository.save(rapport);
    }

}
