package com.example.ddd.example2.domain.entity.user;

import java.math.BigDecimal;

public class UserValueObject {
    public UserValueObject(BigDecimal workingDays, BigDecimal coefficientsSalary, BigDecimal bonus) {
        this.totalSalary = workingDays.multiply(coefficientsSalary).add(bonus);
    }

    private BigDecimal totalSalary;

}
