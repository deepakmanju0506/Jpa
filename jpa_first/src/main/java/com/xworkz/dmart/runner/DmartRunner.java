package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.DmartEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DmartRunner {
    public static void main(String[] args) {
        DmartEntity dmartEntity = new DmartEntity();
        dmartEntity.setDmartLocation("Rajajinagr");
        dmartEntity.setDmartManager("Bala Subramanyam");
        dmartEntity.setGstNo("18%");
        dmartEntity.setNoItems(250);
        System.out.println("Data Saved in Database Successfully");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");//lode driver,user,psw,url
        EntityManager em = emf.createEntityManager();//DML-insert,update,delete
        EntityTransaction et = em.getTransaction();//TCL-commit,rollback,begain

        try {
            et.begin();
            em.persist(dmartEntity);
            et.commit();
            System.out.println("Saved ");
        }catch (Exception e){
            et.rollback();
        }finally {
            emf.close();
            em.close();
        }



    }
}
