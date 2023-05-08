package com.example.sb_homework.beans.tree;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static lombok.AccessLevel.PROTECTED;

@Getter
public abstract class Tree {
    @NonNull
    private final Integer price;
    Boolean isAvailable = false;

    public Tree(Integer cost){
        this.price = cost;
    }

    public void start() {
        isAvailable = true;
        System.out.print("Ready to build! ");
    }

    public void stop() {
        isAvailable = false;
        System.out.print("Furniture is over! ");
    }
}