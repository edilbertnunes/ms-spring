package com.edilbert.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edilbert.payroll.entities.Payment;
import com.edilbert.payroll.entities.Worker;
import com.edilbert.payroll.feignclientes.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDalyIncome(), days);
	}

}
