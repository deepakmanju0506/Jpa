package com.xworkz.ups.runner;

import com.xworkz.ups.enetity.UpsEntity;
import com.xworkz.ups.repo.UpsRepo;
import com.xworkz.ups.repo.UpsRepoImpl;

import javax.persistence.Persistence;
import java.util.List;

public class UpsRunner {
    public static void main(String[] args) {
        UpsEntity ups=new UpsEntity();
        ups.setUses("Home ,office");
        ups.setBrand("AMAZE");
        ups.setCapacity("10000mah");
        ups.setSellerName("AMAzon");
        ups.setWatts(200);
        ups.setPrice(12500.25);

        UpsRepo repo=new UpsRepoImpl();
//        String enadrukodo=repo.save(ups);
//        System.out.println(enadrukodo);
//        List<UpsEntity> entities=repo.readAllData();
//        entities.forEach(r-> System.out.println(r));

        System.out.println(repo.getUpsByBrandName("ZEN"));
        System.out.println(repo.getUpsBySellerName("Pate Agade"));

//                List<String> entities=repo.getAllBrandNames();
//        entities.forEach(r-> System.out.println(r));

        List<Double> entities=repo.getAllPrice();
       entities.forEach(r-> System.out.println(r));
    }
}
