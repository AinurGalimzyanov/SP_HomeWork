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
public class OnlineMarket{

    @Autowired
    List<FactoryFurniture> factoryFurnitureList;

    @PostConstruct
    public void postConstruct() {
        factoryFurnitureList.forEach(
                c -> System.out.printf("Furnitures %s in online market %n", c.hashCode())
        );
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Online market is closed!");
    }
}