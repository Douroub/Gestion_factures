package tn.enicarthage.Projet_web;

import jakarta.persistence.*;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double montant;
    private String description;
    private String date;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

	public Double getMontant() {return montant;}
	public void setMontant(Double montant) {this.montant = montant;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}

   
}