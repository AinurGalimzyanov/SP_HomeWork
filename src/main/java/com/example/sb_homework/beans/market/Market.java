package com.example.sb_homework.beans.market;

import com.example.sb_homework.beans.furniture.FactoryFurniture;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class  Market {
    private List<FactoryFurniture> factoryFurnitureList;

    @Autowired
    public void setAvailableProducts(List<FactoryFurniture> furnitures){
        this.factoryFurnitureList = furnitures;
    }

    @PostConstruct
    public void postConstruct() {
        factoryFurnitureList.forEach(
                c -> System.out.printf("Furnitures %s in market %n", c.hashCode())
        );
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Market is closed!");
    }
}