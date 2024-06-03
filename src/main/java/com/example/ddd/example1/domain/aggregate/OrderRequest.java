package com.example.ddd.example1.domain.aggregate;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class OrderRequest {
    private String id;
    private BigDecimal total;
    private String description;
    private String code;
    private String customerId;
    private String paymentStatus;
    private String status;
    private List<OrderPaymentRequest> orderPayments;
    private List<OrderLineItemRequest> lineItems;

    @Getter
    @Setter
    public static class OrderPaymentRequest {
        private String id;
        private String paymentMethod;
        private BigDecimal amount;
        private String createdBy;
    }

    @Getter
    @Setter
    public static class OrderLineItemRequest {
        private String id;
        private String title;
        private String description;
        private BigDecimal price;
    }
}
