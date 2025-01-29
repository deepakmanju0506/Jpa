package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.WaterEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WaterRunner {
    public static void main(String[] args) {

       WaterEntity water = new WaterEntity();
//        water.setId(1);
//        water.setName("Raju");
//        water.setRating(4.2);
//        water.setLocation("Bashyam Circle");
//        water.setC_no(9957564645L);
//        water.setPincode(5900120L);
//        water.setType("Veg And Non-Veg");

        System.out.println(water);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(water);

//            WaterEntity savedWater = em.merge(water);
            et.commit();

//            System.out.println("Saved Water: " + savedWater);
//            et.begin();
//            WaterEntity entity = em.find(WaterEntity.class, 19);
//            et.commit();
//            System.out.println("Before update: " + entity);
//
//            entity.setName("Mauli");
//            System.out.println("After update: " + entity);
//            WaterEntity updatedEntity = em.merge(entity);
//            System.out.println("Updated Entity: " + updatedEntity);
//
//            et.begin();
//            em.remove(em.contains(updatedEntity) ? updatedEntity : em.merge(updatedEntity));
//            if (updatedEntity != null)
//            {
//                System.out.println("Data deleted");
//            }else {
//                System.out.println("Data not deleted");
//            }
//            et.commit();
//
        } catch (Exception e) {
            System.out.println(e.getMessage());
            et.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}