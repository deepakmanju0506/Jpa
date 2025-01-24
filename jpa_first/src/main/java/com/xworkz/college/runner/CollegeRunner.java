package com.xworkz.college.runner;

import com.xworkz.college.entity.CollegeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeRunner {
    public static void main(String[] args) {
        CollegeEntity collegeEntity = new CollegeEntity();
        collegeEntity.setCollegeName("Atria Institute of Technology");
        collegeEntity.setLocation("Hebbal");
        collegeEntity.setFounderName("Kuppa Raju");
        collegeEntity.setNoOfStudent(7000);
        System.out.println("Data saved in db successfully ");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try{
            et.begin();
            em.persist(collegeEntity);
            et.commit();
            System.out.println("Saved");
        }catch (Exception e){
            et.rollback();
        }finally {
            emf.close();
            em.close();
        }
    }
}
