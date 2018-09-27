/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.StudentAddresses;
import java.util.List;

public interface StudentAddressesService {

	public StudentAddresses getOne(Integer studentId);

	public List<StudentAddresses> findAll();

	public Boolean delete(Integer studentId);

	public StudentAddresses create(StudentAddresses studentAddresses);

	public StudentAddresses update(StudentAddresses studentAddresses);

	public Boolean exist(StudentAddresses studentAddresses);
}
