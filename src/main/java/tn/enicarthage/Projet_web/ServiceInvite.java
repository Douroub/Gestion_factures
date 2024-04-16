package tn.enicarthage.Projet_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ServiceInvite {
	
	@Autowired 
	private InviteRepository inviteRepository ; 
	
	public Invite saveInvite(Invite invite) {
		return inviteRepository.save(invite) ;
	}
	

}
