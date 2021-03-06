/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.StudentLoans;
import java.util.List;

public interface StudentLoansService {

	public StudentLoans getOne(Integer studentLoanId);

	public List<StudentLoans> findAll();

	public Boolean delete(Integer studentLoanId);

	public StudentLoans create(StudentLoans studentLoans);

	public StudentLoans update(StudentLoans studentLoans);

	public Boolean exist(StudentLoans studentLoans);
}
