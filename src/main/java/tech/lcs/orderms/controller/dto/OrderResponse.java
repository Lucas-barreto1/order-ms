package tech.lcs.orderms.controller.dto;

import tech.lcs.orderms.entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getId(), entity.getCustomerId(), entity.getTotal());
    }
}
