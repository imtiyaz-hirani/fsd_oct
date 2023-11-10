package com.controller;

import com.enums.PaymentType;
import com.factory.PaymentFactory;
import com.service.CreditCardService;
import com.service.DebitCardService;
import com.service.NetBankingService;
import com.service.UpiService;

public class PaymentController {
	public static void main(String[] args) {
		
		((UpiService)PaymentFactory.getPaymentObj(PaymentType.UPI.toString())).limit();
		((CreditCardService)PaymentFactory.getPaymentObj(PaymentType.CC.toString())).limit();
 
	}
}

interface Inter{
	void m1();
}

class A implements Inter{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
