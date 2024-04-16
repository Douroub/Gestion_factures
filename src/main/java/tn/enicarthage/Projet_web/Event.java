package tn.enicarthage.Projet_web;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Events nom;
    private String lieu;
    private String theme;
    private Integer nombrePersonnes;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Depense> depenses;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Revenu> revenus;

	public String getLieu() {return lieu;}
	public void setLieu(String lieu) {this.lieu = lieu;}
	public Integer getNombrePersonnes() {return nombrePersonnes;}
	public void setNombrePersonnes(Integer nombrePersonnes) {this.nombrePersonnes = nombrePersonnes;}
	public String getTheme() {return theme;}
	public void setTheme(String theme) {this.theme = theme;}
	public Events getNom() {return nom;}
	public void setNom(Events nom) {this.nom = nom;}

    
}
