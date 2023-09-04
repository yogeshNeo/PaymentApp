package com.paymentApp.repository;

import com.paymentApp.model.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

    public List<Payment> findByOrderId(long orderId);
}