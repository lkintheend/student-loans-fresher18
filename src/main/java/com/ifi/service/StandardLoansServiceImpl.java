/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;



import java.util.List;

import javax.transaction.Transactional;

import com.ifi.entity.StandardLoans;
import com.ifi.repository.StandardLoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StandardLoansServiceImpl implements StandardLoansService {

	@Autowired
	private StandardLoansRepository standardLoansRepository;

	@Override
	public StandardLoans getOne(Integer standardLoanId) {
		return standardLoansRepository.getOne(standardLoanId);
	}

	@Override
	public Boolean delete(Integer standardLoanId) {
		if (standardLoansRepository.getOne(standardLoanId) != null) {
			standardLoansRepository.deleteById(standardLoanId);
			return true;
		}
		return false;
	}

	@Override
	public StandardLoans create(StandardLoans standardLoans) {
		return standardLoansRepository.save(standardLoans);
	}

	@Override
	public StandardLoans update(StandardLoans standardLoansToUpdate) {
						StandardLoans standardLoans = standardLoansRepository.getOne(standardLoansToUpdate.getStandardLoanId());
																														
				if(standardLoansToUpdate.getStandardLoanName() !=null) {
			
		}
				if(standardLoansToUpdate.getStandardLoanMinAmount() !=null) {
			
		}
				if(standardLoansToUpdate.getStandardLoanMaxAmount() !=null) {
			
		}
				if(standardLoansToUpdate.getStandardLoanPeriod() !=null) {
			
		}
				if(standardLoansToUpdate.getStandardLoanDescription() !=null) {
			
		}
				if(standardLoansToUpdate.getStandardLoanDetails() !=null) {
			
		}
				return standardLoansRepository.save(standardLoans);
	}

	@Override
	public Boolean exist(StandardLoans standardLoans) {
						return standardLoansRepository.existsById(standardLoans.getStandardLoanId());
																													}

	@Override
	public List<StandardLoans> findAll() {
		return standardLoansRepository.findAll();
	}

}

