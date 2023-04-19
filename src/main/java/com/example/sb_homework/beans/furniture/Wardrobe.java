package com.example.sb_homework.beans.furniture;

import com.example.sb_homework.beans.tree.Tree;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Wardrobe extends FactoryFurniture {

    public Wardrobe(@Qualifier(value = "maple") Tree tree) {
        super(tree);
    }

}