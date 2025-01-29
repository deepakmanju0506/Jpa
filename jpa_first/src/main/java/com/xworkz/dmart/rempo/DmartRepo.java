package com.xworkz.dmart.rempo;

import com.xworkz.dmart.entity.DmartEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DmartRepo {

    public Boolean saveDataToDb(DmartEntity dmartEntity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(dmartEntity);
            et.commit();
            System.out.println("Data saved " + dmartEntity);
            return true;
        } catch (Exception e) {
            et.rollback();
        } finally {
            emf.close();
            em.close();
        }
        return false;
    }

    public boolean updateDataInDB(int id,String gstNo,String dmartManager,int noItems) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("X-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            DmartEntity de = em.find(DmartEntity.class, id);
            if (de != null) {
                de.setGstNo(gstNo);
                de.setDmartManager(dmartManager);
                de.setNoItems(noItems);
                em.merge(de);
                et.commit();
            }

 return true;

        } catch (Exception e) {

          e.getMessage();
          et.rollback();

        }finally {
            emf.close();
            em.close();
        }

        return false;
    }
    public boolean deleteDataInDb(int id){
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("X-workz");
        EntityManager em =emf.createEntityManager();
        EntityTransaction et =em.getTransaction();

        try{
            et.begin();
            DmartEntity de=em.find(DmartEntity.class,id);
//            System.out.println("before "+de);
            em.remove(de);
            et.commit();

            return true;
        }catch (Exception e){
            et.rollback();
        }finally {
            emf.close();
            em.close();
        }
        return false;
    }

}