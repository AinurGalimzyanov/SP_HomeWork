package com.example.sb_homework.beans.furniture;

import com.example.sb_homework.beans.tree.Tree;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class FactoryFurniture {

    @NonNull
    private final Tree tree;

    Boolean inStock = true;

    @PostConstruct
    public void postConstruct() {
        tree.start();
        System.out.printf("The trees are ready for use: %s%n", tree.getIsAvailable());
        System.out.println(tree.getPrice());
    }

    @PreDestroy
    public void preDestroy() {
        tree.stop();
        System.out.printf("The trees are ready for use: %s%n", tree.getIsAvailable());
        System.out.println(tree.getPrice());
    }
}