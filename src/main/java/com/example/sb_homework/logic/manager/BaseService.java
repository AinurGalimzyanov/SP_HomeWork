package com.example.sb_homework.logic.manager;

import org.springframework.stereotype.Service;

@Service
public interface BaseService<T> {
    T create(T dal);
    T get(Long id);
    void update(T dal);
    void delete(Long id);
}
