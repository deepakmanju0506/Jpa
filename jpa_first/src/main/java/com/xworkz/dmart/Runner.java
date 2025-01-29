package com.xworkz.dmart;

import com.xworkz.dmart.entity.DmartEntity;
import com.xworkz.dmart.rempo.DmartRepo;

public class Runner {
    public static void main(String[] args) {

        DmartRepo repo=new DmartRepo();
//        repo.saveDataToDb(dmartEntity);
//        repo.updateDataInDB(3,"24AACCB6672L1ZG","null",3600);
        repo.deleteDataInDb(2);
    }
}
