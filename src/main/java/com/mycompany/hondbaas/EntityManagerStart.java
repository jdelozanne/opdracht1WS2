/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hondbaas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author julia
 */
public class EntityManagerStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        save();
        
        
    }

    public static void save() {
        EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = entityfactory.createEntityManager();
        em.getTransaction().begin();

        Baas b = new Baas();
       
        b.setNaam("julia");
        em.persist(b);
        em.getTransaction().commit();
        em.close();

        System.out.println(b.toString());
        
    }

    public static void find() {
        EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = entityfactory.createEntityManager();
        Baas c = em.find(Baas.class, 0);
        System.out.println(c.toString());
        
    }

    public static void remove() {
        EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = entityfactory.createEntityManager();
        
        
       
        Baas d = em.find(Baas.class, 2);
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
        em.close();
        System.out.println("removed");
    }
}
