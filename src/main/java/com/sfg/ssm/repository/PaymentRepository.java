package com.sfg.ssm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfg.ssm.domain.Payment;

public interface PaymentRepository extends  JpaRepository<Payment,Long> {

	
}
