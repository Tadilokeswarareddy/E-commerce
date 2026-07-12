package com.lokesh.ecommerce.kafka;

import com.lokesh.ecommerce.customer.CustomerResponse;
import com.lokesh.ecommerce.order.PaymentMethod;
import com.lokesh.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
