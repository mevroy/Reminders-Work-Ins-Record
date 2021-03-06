package com.yourpackagename.yourwebproject.scheduler.writers;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yourpackagename.yourwebproject.model.entity.GroupEventPaymentTransaction;
import com.yourpackagename.yourwebproject.model.entity.GroupSMS;
import com.yourpackagename.yourwebproject.model.entity.GroupSMSActivity;
import com.yourpackagename.yourwebproject.model.entity.enums.SmsStatus;
import com.yourpackagename.yourwebproject.service.GroupEventPaymentTransactionService;
import com.yourpackagename.yourwebproject.service.GroupSMSService;

@Component("paymentTransactionWriter")
public class PaymentTransactionItemWriter implements ItemStreamWriter<GroupEventPaymentTransaction> {
	protected @Autowired GroupEventPaymentTransactionService groupEventPaymentTransactionService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(PaymentTransactionItemWriter.class);
	/**
	 * @see ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends GroupEventPaymentTransaction> groupEventPaymentTransactionList) {

		for(GroupEventPaymentTransaction transaction: groupEventPaymentTransactionList)
		{
			transaction.setUpdatedAt(Calendar.getInstance().getTime());
				try {

					groupEventPaymentTransactionService.update(transaction);
					logger.info("Updated Transaction Object:"+transaction.getTransactionId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//	}
		}
	
	}

	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void open(ExecutionContext arg0) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void update(ExecutionContext arg0) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}
}
