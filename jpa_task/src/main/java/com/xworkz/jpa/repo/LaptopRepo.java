package com.xworkz.jpa.repo;

import com.xworkz.jpa.entity.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LaptopRepo {

    public boolean setDataInDB(LaptopEntity laptopEntity){
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("Flair");
        EntityManager em =emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
   try{
       et.begin();
       em.persist(laptopEntity);
       et.commit();

       return true;
   }catch(Exception e){
       e.getMessage();
       et.rollback();
   }finally{
       emf.close();
       em.close();
   }
        return false;
    }

    public void updateDataInDB(int id,String brand,String sellerName){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Flair");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try{
           et.begin();
           LaptopEntity laptopEntity=em.find(LaptopEntity.class,1);
           if(laptopEntity != null)
           laptopEntity.setBrand(brand);
           laptopEntity.setSellerName(sellerName);
           em.merge(laptopEntity);
               et.commit();

    }catch (Exception e){
            e.getMessage();
            et.rollback();
        }finally {
            emf.close();
            em.close();
        }
        }

}
