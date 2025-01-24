package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.DmartEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            DmartEntity de = em.find(DmartEntity.class, 1);
            System.out.println("before update"+de);
            de.setNoItems(2005);
            de.setDmartManager(null);
            de.setGstNo("5%");
            DmartEntity afterupdate = em.merge(de);
            System.out.println("after update"+afterupdate);
            et.commit();


        } catch (Exception e) {
        e.getMessage();
        et.rollback();
        }finally {
            emf.close();
            em.close();
        }

    }
}
