package com.factory;

import com.service.CreditCardService;
import com.service.DebitCardService;
import com.service.NetBankingService;
import com.service.UpiService;

public class PaymentFactory {

	public static Object getPaymentObj(String paymentType) {
		switch (paymentType.toUpperCase()) {
		case "UPI":
			return new UpiService();

		case "CC":
			return new CreditCardService();
		case "DC":
			return new DebitCardService();
		case "NB":
			return new NetBankingService();
		default:
			return null;
		}
	}
}
