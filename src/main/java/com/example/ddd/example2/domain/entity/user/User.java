package com.example.ddd.example2.domain.entity.user;

import lombok.Getter;
import lombok.Setter;

//entity
@Getter
@Setter
public class User {
    private String name;
    private String username;
    private String password;
    private String dob;
    private String salary;
}
