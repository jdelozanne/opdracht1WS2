/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hondbaas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author julia
 */
@Entity
public class Baas implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column
    private int id;
    @Column (length= 30, nullable = false)
    private String naam;
    @OneToOne
    @JoinColumn(name="hond_id")
    private Hond hond;

    public Baas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setHond(Hond hond) {
        this.hond= hond;
    }

    @Override
    public String toString() {
        return "Baas{" + "id=" + id + ", naam=" + naam + '}';
    }

}
