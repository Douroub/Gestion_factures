package tn.enicarthage.Projet_web;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Rapport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRapport;

    private String dateGeneration;
    private String contenu;

    @OneToMany(mappedBy = "rapport", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Depense> depenses;

    @OneToMany(mappedBy = "rapport", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Revenu> revenus;

	public String getDateGeneration() {return dateGeneration;}
	public void setDateGeneration(String dateGeneration) {this.dateGeneration = dateGeneration;}
	public String getContenu() {return contenu;}
	public void setContenu(String contenu) {this.contenu = contenu;}

    
}