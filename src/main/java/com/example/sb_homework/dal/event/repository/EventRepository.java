package com.example.sb_homework.dal.event.repository;

import com.example.sb_homework.dal.event.EventDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventDal, Long> {
}
