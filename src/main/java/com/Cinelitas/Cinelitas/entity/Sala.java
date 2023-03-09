package com.Cinelitas.Cinelitas.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table (name="sala")

public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long Id;
    private String nom_sala;
    private String num_sala;
    private String max_cap;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNom_sala() {
        return nom_sala;
    }

    public void setNom_sala(String nom_sala) {
        this.nom_sala = nom_sala;
    }

    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public String getMax_cap() {
        return max_cap;
    }

    public void setMax_cap(String max_cap) {
        this.max_cap = max_cap;
    }
    
    
    
}


