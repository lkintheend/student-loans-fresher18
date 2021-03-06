/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.PlannedPayments;
import com.ifi.repository.PlannedPaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlannedPaymentsServiceImpl implements PlannedPaymentsService {

	@Autowired
	private PlannedPaymentsRepository plannedPaymentsRepository;

	@Override
	public PlannedPayments getOne(Integer regularOrderId) {
		return plannedPaymentsRepository.getOne(regularOrderId);
	}

	@Override
	public Boolean delete(Integer regularOrderId) {
		if (plannedPaymentsRepository.getOne(regularOrderId) != null) {
			plannedPaymentsRepository.deleteById(regularOrderId);
			return true;
		}
		return false;
	}

	@Override
	public PlannedPayments create(PlannedPayments plannedPayments) {
		return plannedPaymentsRepository.save(plannedPayments);
	}

	@Override
	public PlannedPayments update(PlannedPayments plannedPaymentsToUpdate) {
						PlannedPayments plannedPayments = plannedPaymentsRepository.getOne(plannedPaymentsToUpdate.getRegularOrderId());
																										
				if(plannedPaymentsToUpdate.getStudents() !=null) {
			
		}
				if(plannedPaymentsToUpdate.getRefPaymentStatus() !=null) {
			
		}
				if(plannedPaymentsToUpdate.getPaymentDueDate() !=null) {
			
		}
				if(plannedPaymentsToUpdate.getPlannedPaymentAmount() !=null) {
			
		}
				if(plannedPaymentsToUpdate.getOtherPaymentDetils() !=null) {
			
		}
				return plannedPaymentsRepository.save(plannedPayments);
	}

	@Override
	public Boolean exist(PlannedPayments plannedPayments) {
						return plannedPaymentsRepository.existsById(plannedPayments.getRegularOrderId());
																									}

	@Override
	public List<PlannedPayments> findAll() {
		return plannedPaymentsRepository.findAll();
	}

}

