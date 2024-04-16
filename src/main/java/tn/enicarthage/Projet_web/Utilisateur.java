package tn.enicarthage.Projet_web;
import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED) 


public class Utilisateur {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(nullable = false, unique = true)
	    private String username;
	    @Column(nullable = false)
	    private String password;

	    public enum Role {ADMIN, INVITE} ; 
	    @Enumerated(EnumType.STRING)
	    private Role role;
	    
	    

}

