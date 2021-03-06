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
        find();
        System.exit(0);
        
    }

    public static void save() {
        EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = entityfactory.createEntityManager();
        em.getTransaction().begin();

        Baas b = new Baas();
        Hond h = new Hond();
        Hond x = new Hond();
        Hond c = new Hond();
        b.setHonden(h);
        b.setHonden(x);
        b.setHonden(c);
       
        b.setNaam("baas");
        em.persist(h);
        em.persist(x);
        em.persist(c);
        em.persist(b);
        em.getTransaction().commit();
        em.close();

        System.out.println(b.toString());
        
    }

    public static void find() {
        EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = entityfactory.createEntityManager();
        //Baas c = em.find(Baas.class, 1);
        Hond c = em.find(Hond.class, 2);
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
