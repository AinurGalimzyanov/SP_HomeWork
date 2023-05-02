package com.example.sb_homework;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestDal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    Integer count;

    public static TestDal createTestDalFrom(String name, Integer count) {
        return TestDal.builder()
                .name(name)
                .count(count)
                .build();
    }
}
