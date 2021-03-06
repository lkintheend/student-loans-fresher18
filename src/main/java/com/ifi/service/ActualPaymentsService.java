/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.ActualPayments;
import java.util.List;

public interface ActualPaymentsService {

	public ActualPayments getOne(Integer actualPaymentId);

	public List<ActualPayments> findAll();

	public Boolean delete(Integer actualPaymentId);

	public ActualPayments create(ActualPayments actualPayments);

	public ActualPayments update(ActualPayments actualPayments);

	public Boolean exist(ActualPayments actualPayments);
}
