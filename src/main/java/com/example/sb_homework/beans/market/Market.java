package com.example.sb_homework.beans.market;

import com.example.sb_homework.beans.furniture.FactoryFurniture;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class  Market {

    private List<FactoryFurniture> factoryFurnitureList;

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