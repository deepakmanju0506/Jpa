package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.LaptopEntity;
import com.xworkz.jpa.repo.LaptopRepo;

public class LaptopRunner {
    public static void main(String[] args) {
//        LaptopEntity laptopEntity = new LaptopEntity();
//        laptopEntity.setBrand("Dell");
//        laptopEntity.setStorage(256);
//        laptopEntity.setModelNO("inspiron3650");
//        laptopEntity.setSellerName("Vinay Enterprise");
//        laptopEntity.setPrice(69000.00);

        LaptopRepo laptopRepo =new LaptopRepo();
//        laptopRepo.setDataInDB(laptopEntity);
        laptopRepo.updateDataInDB(1,"Hp","Omkar Service center");
    }

}
