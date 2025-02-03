package com.xworkz.ups.repo;

import com.xworkz.ups.enetity.UpsEntity;

import java.util.List;

public interface UpsRepo {
    String save(UpsEntity entity);
    List<UpsEntity> readAllData();
    UpsEntity getUpsByBrandName(String brand);
    List<UpsEntity> getUpsBySellerName(String sellerName);
    List<String> getAllBrandNames();
    List<Double> getAllPrice();
}
