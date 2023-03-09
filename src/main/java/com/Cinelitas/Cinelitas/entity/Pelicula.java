package com.Cinelitas.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name="paises")
public class Pelicula implements Serializable{
    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nom_peli;
    private String costo;
    private String fecha;
    private String sala;
    
           
    
    
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom_peli() {
        return nom_peli;
    }

    public void setNom_peli(String nom_peli) {
        this.nom_peli = nom_peli;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Sala getSala_id() {
        return sala_id;
    }

    public void setSala_id(Sala sala_id) {
        this.sala_id = sala_id;
    }
    
    
    
}
