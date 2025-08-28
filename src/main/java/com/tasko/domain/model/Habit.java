package com.tasko.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.Calendar;

@Getter
@Setter
public class Habit {
    private Long id;
    private String name;
    private String description;
    private Double streak;
    private Calendar lastTimeFullfilled;
    private User user;
}
