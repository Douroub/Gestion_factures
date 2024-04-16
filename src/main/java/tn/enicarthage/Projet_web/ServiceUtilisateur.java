package tn.enicarthage.Projet_web;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUtilisateur {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public ServiceUtilisateur(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur saveUtilisateur(Utilisateur user) {
        return utilisateurRepository.save(user);
    }
    
    public Utilisateur findByUsername(String username) {
        return utilisateurRepository.findByUsername(username);
    }
    
    public Optional<Utilisateur> getUserById(Long id) {
        return utilisateurRepository.findById(id);
    }
    
    public List<Utilisateur > getAllUsers() {
        return utilisateurRepository.findAll();
    }
    
    public void deleteUser(Long id) {
    	utilisateurRepository.deleteById(id);
    }
    

}



