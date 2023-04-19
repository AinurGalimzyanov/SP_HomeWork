package com.example.sb_homework.beans.furniture;

import com.example.sb_homework.beans.tree.Tree;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chair extends FactoryFurniture {

    public Chair(@Qualifier(value = "oak") Tree tree) {
        super(tree);
    }

}