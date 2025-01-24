package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.DmartEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadRunner {
    public static void main(String[] args) {


       EntityManagerFactory emf= Persistence.createEntityManagerFactory("X-workz");
       EntityManager em = emf.createEntityManager();

        try{
         DmartEntity ref=   em.find(DmartEntity.class,1);
            System.out.println(ref);

        }catch (Exception exception){
            exception.getMessage();
        }
        finally {
            emf.close();
            em.close();
        }
    }
}
