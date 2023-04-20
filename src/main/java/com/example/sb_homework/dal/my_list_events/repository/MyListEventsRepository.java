package com.example.sb_homework.dal.my_list_events.repository;

import com.example.sb_homework.dal.my_list_events.MyListEventsDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyListEventsRepository extends JpaRepository<MyListEventsDal, Long> {
}
