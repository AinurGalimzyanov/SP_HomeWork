package com.example.sb_homework.dal.my_list_events;

import com.example.sb_homework.api.controllers.dto.request.CheckDBModelRequest;
import com.example.sb_homework.dal.event.EventDal;
import lombok.*;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "list")
public class MyListEventsDal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @OneToMany(mappedBy = "eventList", cascade = CascadeType.ALL)
    List<EventDal> events  = new LinkedList<>();

    public static MyListEventsDal createMyListEventsDalFrom(CheckDBModelRequest request) {
        return MyListEventsDal.builder()
                .name(request.getName())
                .events(new LinkedList<>())
                .build();
    }
}

