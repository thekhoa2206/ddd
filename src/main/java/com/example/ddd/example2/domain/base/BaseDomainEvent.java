package com.example.ddd.example2.domain.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BaseDomainEvent {
    private LocalDate createdOn;
    private String eventId;
}
