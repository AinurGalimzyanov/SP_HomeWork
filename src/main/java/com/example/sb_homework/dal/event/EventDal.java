package com.example.sb_homework.dal.event;

import com.example.sb_homework.dal.my_list_events.MyListEventsDal;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
public class EventDal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @ManyToOne()
    @JoinColumn(name = "my_list_events_id")
    MyListEventsDal eventList;

    public static EventDal createEventFrom(String name, MyListEventsDal myListEvents) {
        return EventDal.builder()
                .name(name)
                .eventList(myListEvents)
                .build();
    }
}