package com.xworkz.ups.repo;

import com.xworkz.ups.enetity.UpsEntity;

import javax.persistence.*;
import java.util.List;

public class UpsRepoImpl implements UpsRepo {


    @Override
    public String save(UpsEntity entity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UPS");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();
            return "Data saved";
        } catch (Exception e) {
            e.getMessage();
        } finally {
            emf.close();
            em.close();
        }
        return "Data not saved";
    }

    @Override
    public List<UpsEntity> readAllData() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UPS");
        List<UpsEntity> result = emf.createEntityManager().createNamedQuery("getUpsData").getResultList();
        return result;
    }

    @Override
    public UpsEntity getUpsByBrandName(String brand) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("UPS");
       Query query = emf.createEntityManager().createNamedQuery("getUpsByBrand").setParameter("brandName",brand);
        UpsEntity entity=(UpsEntity)  query.getSingleResult();
        return entity;
    }

    @Override
    public List<UpsEntity> getUpsBySellerName(String sellerName) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("UPS");
       Query query=emf.createEntityManager().createNamedQuery("getUpsBySellerName").setParameter("sellerName",sellerName);
       List<UpsEntity> entity= query.getResultList();
       return entity;

    }

    @Override
    public List<String> getAllBrandNames() {
        List<String> ref=Persistence.createEntityManagerFactory("UPS").
                createEntityManager().createNamedQuery("getAllBrandNames").getResultList();
        return ref;
    }

    @Override
    public List<Double> getAllPrice() {
        List<Double> ref=Persistence.createEntityManagerFactory("UPS").
                createEntityManager().createNamedQuery("getAllPrice").getResultList();
        return ref;
    }


}
