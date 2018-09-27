/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.StandardLoans;
import java.util.List;

public interface StandardLoansService {

	public StandardLoans getOne(Integer standardLoanId);

	public List<StandardLoans> findAll();

	public Boolean delete(Integer standardLoanId);

	public StandardLoans create(StandardLoans standardLoans);

	public StandardLoans update(StandardLoans standardLoans);

	public Boolean exist(StandardLoans standardLoans);
}
