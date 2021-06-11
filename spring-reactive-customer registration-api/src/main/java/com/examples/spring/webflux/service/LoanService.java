package com.examples.spring.webflux.service;

import org.springframework.stereotype.Component;

import com.examples.spring.webflux.model.LoanDetails;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface LoanService {
	public static Mono<LoanDetails> applyLoan(LoanDetails loanDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	public Mono<LoanDetails> getCustomerLoanDetails(Integer customerId);
}
