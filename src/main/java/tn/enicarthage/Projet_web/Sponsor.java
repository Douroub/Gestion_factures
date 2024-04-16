package tn.enicarthage.Projet_web;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

    // Assume that a Sponsor can sponsor many Events
    @ManyToMany(mappedBy = "sponsors")
    private List<Event> events;

	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}

    
}
