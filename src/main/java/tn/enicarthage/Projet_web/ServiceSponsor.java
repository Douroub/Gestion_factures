package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceSponsor {
	@Autowired
    private SponsorRepository sponsorRepository;
	
	public Sponsor saveSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

}
