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
EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("persistenceUnit"); 
EntityManager em = entityfactory.createEntityManager();
em.getTransaction();
    }
    
}
